package domainTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import domain.impl.TeamStatsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import persistence.TeamEntity;
import persistence.TeamRepository;
import persistence.TeamStatsEntity;
import persistence.TeamStatsRepository;

import java.util.Optional;

public class TeamStatsServiceTest {

    @Mock
    private TeamStatsRepository teamStatsRepository;

    @Mock
    private TeamRepository teamRepository;

    @InjectMocks
    private TeamStatsServiceImpl teamStatsService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldReturnTeamStatsByTeam() {
        // Arrange
        TeamEntity team = new TeamEntity();
        team.setId(1L);
        
        TeamStatsEntity stats = new TeamStatsEntity();
        stats.setTeam(team);
        
        when(teamRepository.findById(1L)).thenReturn(Optional.of(team));
        when(teamStatsRepository.findByTeam(team)).thenReturn(Optional.of(stats));

        // Act
        Optional<TeamStatsEntity> result = teamStatsService.getTeamStatsByTeam(1L);

        // Assert
        assertThat(result).isPresent();

        // Verify repository was called
        verify(teamRepository, times(1)).findById(1L);
        verify(teamStatsRepository, times(1)).findByTeam(team);
    }

    @Test
    void shouldUpdateTeamStats() {
        // Arrange
        TeamEntity team = new TeamEntity();
        team.setId(1L);
        
        TeamStatsEntity existingStats = new TeamStatsEntity();
        existingStats.setTeam(team);
        
        TeamStatsEntity updatedStats = new TeamStatsEntity();
        updatedStats.setMatchesPlayed(10);
        updatedStats.setWins(5);
        updatedStats.setDraws(3);
        updatedStats.setLosses(2);
        updatedStats.setGoalsScored(15);
        updatedStats.setGoalsConceded(8);
        updatedStats.setPoints(18);
        updatedStats.setGoalDifference(7);
        updatedStats.setTeam(team);

        when(teamStatsRepository.findByTeam(team)).thenReturn(Optional.of(existingStats));
        when(teamStatsRepository.save(any(TeamStatsEntity.class))).thenReturn(existingStats);

        // Act
        TeamStatsEntity result = teamStatsService.updateTeamStats(updatedStats);

        // Assert
        assertThat(result.getMatchesPlayed()).isEqualTo(10);
        assertThat(result.getGoalsScored()).isEqualTo(15);
        assertThat(result.getPoints()).isEqualTo(18);

        // Verify repository was called
        verify(teamStatsRepository, times(1)).findByTeam(team);
        verify(teamStatsRepository, times(1)).save(any(TeamStatsEntity.class));
    }
}
