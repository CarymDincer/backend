package integrationTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import domain.MatchService;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.behindthegoal.Main;

import persistence.*;

import java.util.List;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Main.class)
@Testcontainers
@TestPropertySource(locations = "classpath:application-test.properties")
public class MatchServiceIT {

    @Autowired
    private MatchService matchService;

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private LeagueRepository leagueRepository;

    @Container
    private static final PostgreSQLContainer<?> postgresContainer = new PostgreSQLContainer<>("postgres:15")
            .withDatabaseName("testdb")
            .withUsername("test")
            .withPassword("test");

    private LeagueEntity testLeague;
    private TeamEntity homeTeam;
    private TeamEntity awayTeam;
    private MatchEntity match1;
    private MatchEntity match2;

    @BeforeEach
    void cleanDatabase() {
        matchRepository.deleteAll();
        teamRepository.deleteAll();
        leagueRepository.deleteAll();

        // Yeni bir lig oluştur ve kaydet
        testLeague = new LeagueEntity();
        testLeague.setName("Premier League");
        testLeague.setCountry("England");
        leagueRepository.save(testLeague);

        // İki takım oluştur ve kaydet
        homeTeam = new TeamEntity();
        homeTeam.setName("Home Team");
        homeTeam.setLeague(testLeague);
        homeTeam = teamRepository.save(homeTeam);

        awayTeam = new TeamEntity();
        awayTeam.setName("Away Team");
        awayTeam.setLeague(testLeague);
        awayTeam = teamRepository.save(awayTeam);

        // İki maç oluştur ve kaydet
        match1 = new MatchEntity();
        match1.setMatchDate(java.time.LocalDate.now().toString());  // ✅ `.toString()` eklendi
        match1.setLeague(testLeague);
        match1.setHomeTeam(homeTeam);
        match1.setAwayTeam(awayTeam);
        matchRepository.save(match1);

        match2 = new MatchEntity();
        match2.setMatchDate(java.time.LocalDate.now().toString());  // ✅ `.toString()` eklendi
        match2.setLeague(testLeague);
        match2.setHomeTeam(homeTeam);
        match2.setAwayTeam(awayTeam);
        matchRepository.save(match2);
    }

    @Test
    void shouldRetrieveMatchesByLeague() {
        List<MatchEntity> matches = matchService.getMatchesByLeague(testLeague.getId());

        assertThat(matches).hasSize(2);
        assertThat(matches.get(0).getLeague().getName()).isEqualTo("Premier League");
    }

    @Test
    void shouldRetrieveMatchById() {
        Optional<MatchEntity> retrievedMatch = matchService.getMatchById(match1.getId());

        assertThat(retrievedMatch).isPresent();
        assertThat(retrievedMatch.get().getId()).isEqualTo(match1.getId());
    }

    @Test
    void shouldReturnEmptyForNonExistingMatch() {
        Optional<MatchEntity> retrievedMatch = matchService.getMatchById(999L);

        assertThat(retrievedMatch).isEmpty();
    }

    @Test
    void shouldRetrieveMatchesWithPagination() {
        Pageable pageable = PageRequest.of(0, 1);
        Page<MatchEntity> matchPage = matchService.getMatchesByLeagueWithPagination(testLeague.getId(), pageable);

        assertThat(matchPage).isNotNull();
        assertThat(matchPage.getTotalElements()).isEqualTo(2);
        assertThat(matchPage.getContent()).hasSize(1);
    }

    @Test
    void shouldReturnEmptyPageForNonExistingLeague() {
        Pageable pageable = PageRequest.of(0, 1);
        Page<MatchEntity> matchPage = matchService.getMatchesByLeagueWithPagination(999L, pageable);

        assertThat(matchPage).isNotNull();
        assertThat(matchPage.getTotalElements()).isEqualTo(0);
    }
}
