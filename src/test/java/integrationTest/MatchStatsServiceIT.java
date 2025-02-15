package integrationTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import domain.MatchStatsService;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
public class MatchStatsServiceIT {

    @Autowired
    private MatchStatsService matchStatsService;

    @Autowired
    private MatchStatsRepository matchStatsRepository;

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
    private TeamEntity testTeam;
    private MatchEntity testMatch;
    private MatchStatsEntity testMatchStats;

    @BeforeEach
    void cleanDatabase() {
        matchStatsRepository.deleteAll();
        matchRepository.deleteAll();
        teamRepository.deleteAll();
        leagueRepository.deleteAll();

        // Yeni bir lig oluştur ve kaydet
        testLeague = new LeagueEntity();
        testLeague.setName("Premier League");
        testLeague.setCountry("England");
        leagueRepository.save(testLeague);

        // Bir takım oluştur ve kaydet
        testTeam = new TeamEntity();
        testTeam.setName("Test Team");
        testTeam.setLeague(testLeague);
        teamRepository.save(testTeam);

        // Bir maç oluştur ve kaydet
        testMatch = new MatchEntity();
        testMatch.setMatchDate(java.time.LocalDate.now().toString());
        testMatch.setLeague(testLeague);
        testMatch.setHomeTeam(testTeam);
        testMatch.setAwayTeam(testTeam);
        matchRepository.save(testMatch);

        // Bir MatchStats kaydet
        testMatchStats = new MatchStatsEntity();
        testMatchStats.setMatch(testMatch);
        testMatchStats.setTeam(testTeam);
        testMatchStats.setGoals(2);
        testMatchStats.setShots(5);
        testMatchStats.setShotsOnTarget(3);
        testMatchStats.setPossession(60);
        testMatchStats.setFoulsCommitted(10);
        testMatchStats.setYellowCards(2);
        testMatchStats.setRedCards(0);
        matchStatsRepository.save(testMatchStats);
    }

    @Test
    void shouldRetrieveMatchStatsByMatch() {
        List<MatchStatsEntity> statsList = matchStatsService.getMatchStatsByMatch(testMatch.getId());

        assertThat(statsList).isNotEmpty();
        assertThat(statsList.get(0).getMatch().getId()).isEqualTo(testMatch.getId());
    }

    @Test
    void shouldRetrieveMatchStatsById() {
        Optional<MatchStatsEntity> retrievedStats = matchStatsService.getMatchStatsById(testMatchStats.getId());

        assertThat(retrievedStats).isPresent();
        assertThat(retrievedStats.get().getId()).isEqualTo(testMatchStats.getId());
    }

    @Test
    void shouldCreateMatchStats() {
        MatchStatsEntity newStats = new MatchStatsEntity();
        newStats.setMatch(testMatch);
        newStats.setTeam(testTeam);
        newStats.setGoals(3);
        newStats.setShots(6);
        newStats.setShotsOnTarget(4);
        newStats.setPossession(55);
        newStats.setFoulsCommitted(8);
        newStats.setYellowCards(1);
        newStats.setRedCards(1);

        MatchStatsEntity savedStats = matchStatsService.createMatchStats(newStats);

        assertThat(savedStats.getId()).isNotNull();
        assertThat(savedStats.getGoals()).isEqualTo(3);
    }

    @Test
    void shouldUpdateMatchStats() {
        MatchStatsEntity updatedStats = new MatchStatsEntity();
        updatedStats.setGoals(4);
        updatedStats.setShots(8);
        updatedStats.setShotsOnTarget(5);
        updatedStats.setPossession(50);
        updatedStats.setFoulsCommitted(7);
        updatedStats.setYellowCards(2);
        updatedStats.setRedCards(1);

        MatchStatsEntity result = matchStatsService.updateMatchStats(testMatchStats.getId(), updatedStats);

        assertThat(result.getGoals()).isEqualTo(4);
        assertThat(result.getShots()).isEqualTo(8);
        assertThat(result.getShotsOnTarget()).isEqualTo(5);
        assertThat(result.getPossession()).isEqualTo(50);
        assertThat(result.getFoulsCommitted()).isEqualTo(7);
        assertThat(result.getYellowCards()).isEqualTo(2);
        assertThat(result.getRedCards()).isEqualTo(1);
    }

    @Test
    void shouldThrowExceptionWhenUpdatingNonExistingMatchStats() {
        MatchStatsEntity newStats = new MatchStatsEntity();
        newStats.setGoals(3);
        newStats.setShots(7);
        newStats.setShotsOnTarget(4);
        newStats.setPossession(50);
        newStats.setFoulsCommitted(9);
        newStats.setYellowCards(1);
        newStats.setRedCards(0);

        assertThrows(EntityNotFoundException.class, () -> {
            matchStatsService.updateMatchStats(999L, newStats);
        });
    }
}
