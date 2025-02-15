package domainTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


import domain.impl.MatchStatsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import persistence.MatchStatsEntity;
import persistence.MatchStatsRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchStatsServiceTest {

    @Mock
    private MatchStatsRepository matchStatsRepository;

    @InjectMocks
    private MatchStatsServiceImpl matchStatsService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldReturnMatchStatsByMatch() {
        // Arrange
        MatchStatsEntity stats1 = new MatchStatsEntity();
        stats1.setId(1L);
        
        MatchStatsEntity stats2 = new MatchStatsEntity();
        stats2.setId(2L);
        
        when(matchStatsRepository.findByMatchId(1L)).thenReturn(Arrays.asList(stats1, stats2));

        // Act
        List<MatchStatsEntity> stats = matchStatsService.getMatchStatsByMatch(1L);

        // Assert
        assertThat(stats).hasSize(2);

        // Verify repository was called
        verify(matchStatsRepository, times(1)).findByMatchId(1L);
    }

    @Test
    void shouldReturnMatchStatsById() {
        // Arrange
        MatchStatsEntity stats = new MatchStatsEntity();
        stats.setId(1L);

        when(matchStatsRepository.findById(1L)).thenReturn(Optional.of(stats));

        // Act
        Optional<MatchStatsEntity> result = matchStatsService.getMatchStatsById(1L);

        // Assert
        assertThat(result).isPresent();

        // Verify repository was called
        verify(matchStatsRepository, times(1)).findById(1L);
    }

    @Test
    void shouldSaveNewMatchStats() {
        // Arrange
        MatchStatsEntity stats = new MatchStatsEntity();
        stats.setId(3L);

        when(matchStatsRepository.save(any(MatchStatsEntity.class))).thenReturn(stats);

        // Act
        MatchStatsEntity savedStats = matchStatsService.createMatchStats(stats);

        // Assert
        assertThat(savedStats).isNotNull();

        // Verify repository was called
        verify(matchStatsRepository, times(1)).save(any(MatchStatsEntity.class));
    }

    @Test
    void shouldUpdateMatchStats() {
        // Arrange
        MatchStatsEntity existingStats = new MatchStatsEntity();
        existingStats.setId(1L);

        MatchStatsEntity updatedStats = new MatchStatsEntity();
        updatedStats.setGoals(2);
        updatedStats.setYellowCards(1);
        updatedStats.setRedCards(0);
        updatedStats.setShots(5);
        updatedStats.setShotsOnTarget(3);
        updatedStats.setPossession(60);
        updatedStats.setFoulsCommitted(4);

        when(matchStatsRepository.findByIdWithLock(1L)).thenReturn(Optional.of(existingStats));
        when(matchStatsRepository.save(any(MatchStatsEntity.class))).thenReturn(existingStats);

        // Act
        MatchStatsEntity result = matchStatsService.updateMatchStats(1L, updatedStats);

        // Assert
        assertThat(result.getGoals()).isEqualTo(2);
        assertThat(result.getShotsOnTarget()).isEqualTo(3);
        assertThat(result.getPossession()).isEqualTo(60);

        // Verify repository was called
        verify(matchStatsRepository, times(1)).findByIdWithLock(1L);
        verify(matchStatsRepository, times(1)).save(any(MatchStatsEntity.class));
    }
}
