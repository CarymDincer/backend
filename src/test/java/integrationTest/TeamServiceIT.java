//package integrationTest;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//import domain.TeamService;
//import jakarta.persistence.EntityNotFoundException;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.testcontainers.containers.PostgreSQLContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//
//import com.behindthegoal.Main;
//
//import persistence.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes = Main.class)
//@Testcontainers
//@TestPropertySource(locations = "classpath:application-test.properties")
//public class TeamServiceIT {
//
//    @Autowired
//    private TeamService teamService;
//
//    @Autowired
//    private TeamRepository teamRepository;
//
//    @Autowired
//    private LeagueRepository leagueRepository;
//
//    @Container
//    private static final PostgreSQLContainer<?> postgresContainer = new PostgreSQLContainer<>("postgres:15")
//            .withDatabaseName("testdb")
//            .withUsername("test")
//            .withPassword("test");
//
//    private LeagueEntity testLeague;
//    private TeamEntity testTeam;
//
//    @BeforeEach
//    void cleanDatabase() {
//        teamRepository.deleteAll();
//        leagueRepository.deleteAll();
//
//        // Yeni bir lig oluştur ve kaydet
//        testLeague = new LeagueEntity();
//        testLeague.setName("Premier League");
//        testLeague.setCountry("England");
//        leagueRepository.save(testLeague);
//
//        // Bir takım oluştur ve kaydet
//        testTeam = new TeamEntity();
//        testTeam.setName("Test Team");
//        testTeam.setLeague(testLeague);
//        teamRepository.save(testTeam);
//    }
//
//    @Test
//    void shouldRetrieveTeamsByLeague() {
//        List<TeamEntity> teams = teamService.getTeamsByLeague(testLeague.getId());
//
//        assertThat(teams).isNotEmpty();
//        assertThat(teams.get(0).getLeague().getName()).isEqualTo("Premier League");
//    }
//
//    @Test
//    void shouldRetrieveTeamById() {
//        Optional<TeamEntity> retrievedTeam = teamService.getTeamById(testTeam.getId());
//
//        assertThat(retrievedTeam).isPresent();
//        assertThat(retrievedTeam.get().getId()).isEqualTo(testTeam.getId());
//    }
//
//    @Test
//    void shouldReturnEmptyForNonExistingTeam() {
//        Optional<TeamEntity> retrievedTeam = teamService.getTeamById(999L);
//
//        assertThat(retrievedTeam).isEmpty();
//    }
//
//    @Test
//    void shouldCreateTeam() {
//        TeamEntity newTeam = new TeamEntity();
//        newTeam.setName("New Team");
//        newTeam.setLeague(testLeague);
//
//        TeamEntity savedTeam = teamService.createTeam(newTeam);
//
//        assertThat(savedTeam.getId()).isNotNull();
//        assertThat(savedTeam.getName()).isEqualTo("New Team");
//    }
//
//    @Test
//    void shouldUpdateTeam() {
//        TeamEntity updatedTeam = new TeamEntity();
//        updatedTeam.setName("Updated Team");
//        updatedTeam.setLeague(testLeague);
//
//        TeamEntity result = teamService.updateTeam(testTeam.getId(), updatedTeam);
//
//        assertThat(result.getName()).isEqualTo("Updated Team");
//    }
//
//    @Test
//    void shouldThrowExceptionWhenUpdatingNonExistingTeam() {
//        TeamEntity newTeam = new TeamEntity();
//        newTeam.setName("Invalid Team");
//        newTeam.setLeague(testLeague);
//
//        assertThrows(RuntimeException.class, () -> {
//            teamService.updateTeam(999L, newTeam);
//        });
//    }
//
//    @Test
//    void shouldDeleteTeam() {
//        teamService.deleteTeam(testTeam.getId());
//
//        Optional<TeamEntity> deletedTeam = teamService.getTeamById(testTeam.getId());
//
//        assertThat(deletedTeam).isEmpty();
//    }
//}
