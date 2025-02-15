package integrationTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import jakarta.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.behindthegoal.Main;

import domain.TeamStatsService;
import persistence.TeamEntity;
import persistence.TeamStatsEntity;
import persistence.TeamStatsRepository;
import persistence.TeamRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Main.class)

public class TeamStatsServiceIT {

    @Autowired
    private TeamStatsService teamStatsService;

    @Autowired
    private TeamStatsRepository teamStatsRepository;

    @Autowired
    private TeamRepository teamRepository;

    private TeamEntity savedTeam;
    private TeamStatsEntity savedStats;

    @BeforeEach
    void setUp() {
        // Yeni bir takım oluştur
        TeamEntity team = new TeamEntity();
        team.setName("Test FC");
        

        // Takım istatistiklerini oluştur ve kaydet
        TeamStatsEntity stats = new TeamStatsEntity();
        stats.setTeam(savedTeam);
        stats.setMatchesPlayed(10);
        stats.setWins(5);
        stats.setDraws(3);
        stats.setLosses(2);
        stats.setGoalsScored(15);
        stats.setGoalsConceded(10);
        stats.setPoints(18);
        stats.setGoalDifference(5);

        
        savedTeam = teamRepository.saveAndFlush(team);
        savedStats = teamStatsRepository.saveAndFlush(stats);
    }

    @Test
    void testGetTeamStatsByTeam() {
        Optional<TeamStatsEntity> stats = teamStatsService.getTeamStatsByTeam(savedTeam.getId());

        assertTrue(stats.isPresent());
        assertThat(stats.get().getMatchesPlayed()).isEqualTo(10);
        assertThat(stats.get().getWins()).isEqualTo(5);
    }

    @Test
    void testUpdateTeamStats() {
        savedStats.setWins(6);
        savedStats.setPoints(21);

        TeamStatsEntity updatedStats = teamStatsService.updateTeamStats(savedStats);

        assertThat(updatedStats.getWins()).isEqualTo(6);
        assertThat(updatedStats.getPoints()).isEqualTo(21);
    }

    @Test
    void testGetTeamStatsByInvalidTeamId() {
        Optional<TeamStatsEntity> stats = teamStatsService.getTeamStatsByTeam(999L);
        assertTrue(stats.isEmpty());
    }
}
