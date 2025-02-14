package domainTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import domain.impl.TeamServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import persistence.TeamEntity;
import persistence.TeamRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TeamServiceTest {

    @Mock
    private TeamRepository teamRepository;

    @InjectMocks
    private TeamServiceImpl teamService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldReturnTeamsByLeague() {
        // Arrange
        TeamEntity team1 = new TeamEntity();
        team1.setId(1L);
        
        TeamEntity team2 = new TeamEntity();
        team2.setId(2L);
        
        when(teamRepository.findByLeagueId(1L)).thenReturn(Arrays.asList(team1, team2));

        // Act
        List<TeamEntity> teams = teamService.getTeamsByLeague(1L);

        // Assert
        assertThat(teams).hasSize(2);

        // Verify repository was called
        verify(teamRepository, times(1)).findByLeagueId(1L);
    }

    @Test
    void shouldReturnTeamById() {
        // Arrange
        TeamEntity team = new TeamEntity();
        team.setId(1L);

        when(teamRepository.findById(1L)).thenReturn(Optional.of(team));

        // Act
        Optional<TeamEntity> result = teamService.getTeamById(1L);

        // Assert
        assertThat(result).isPresent();

        // Verify repository was called
        verify(teamRepository, times(1)).findById(1L);
    }

    @Test
    void shouldSaveNewTeam() {
        // Arrange
        TeamEntity team = new TeamEntity();
        team.setId(3L);

        when(teamRepository.save(any(TeamEntity.class))).thenReturn(team);

        // Act
        TeamEntity savedTeam = teamService.createTeam(team);

        // Assert
        assertThat(savedTeam).isNotNull();

        // Verify repository was called
        verify(teamRepository, times(1)).save(any(TeamEntity.class));
    }

    @Test
    void shouldUpdateTeam() {
        // Arrange
        TeamEntity existingTeam = new TeamEntity();
        existingTeam.setId(1L);

        TeamEntity updatedTeam = new TeamEntity();
        updatedTeam.setName("Updated Team");

        when(teamRepository.findById(1L)).thenReturn(Optional.of(existingTeam));
        when(teamRepository.save(any(TeamEntity.class))).thenReturn(existingTeam);

        // Act
        TeamEntity result = teamService.updateTeam(1L, updatedTeam);

        // Assert
        assertThat(result.getName()).isEqualTo("Updated Team");

        // Verify repository was called
        verify(teamRepository, times(1)).findById(1L);
        verify(teamRepository, times(1)).save(any(TeamEntity.class));
    }

    @Test
    void shouldDeleteTeam() {
        // Act
        teamService.deleteTeam(1L);

        // Verify repository was called
        verify(teamRepository, times(1)).deleteById(1L);
    }
}
