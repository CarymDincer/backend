package domainTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import domain.impl.LeagueServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import persistence.LeagueEntity;
import persistence.LeagueRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LeagueServiceTest {
	
	
    @Mock
    private LeagueRepository leagueRepository;

    @InjectMocks
    private LeagueServiceImpl leagueService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
	
    

    @Test
    void shouldReturnAllLeagues() {
        // Arrange
        LeagueEntity league1 = new LeagueEntity();
        league1.setId(1L);
        league1.setName("Premier League");

        LeagueEntity league2 = new LeagueEntity();
        league2.setId(2L);
        league2.setName("La Liga");

        when(leagueRepository.findAll()).thenReturn(Arrays.asList(league1, league2));

        // Act
        List<LeagueEntity> leagues = leagueService.getAllLeagues();

        // Assert
        assertThat(leagues).hasSize(2);
        assertThat(leagues.get(0).getName()).isEqualTo("Premier League");
        assertThat(leagues.get(1).getName()).isEqualTo("La Liga");

        // Verify repository was called
        verify(leagueRepository, times(1)).findAll();
    }
    
    @Test
    void shouldReturnLeagueById() {
        // Arrange
        LeagueEntity league = new LeagueEntity();
        league.setId(1L);
        league.setName("Bundesliga");

        when(leagueRepository.findById(1L)).thenReturn(Optional.of(league));

        // Act
        Optional<LeagueEntity> result = leagueService.getLeagueById(1L); // Optional olarak döndür

        // Assert
        assertThat(result).isPresent(); // Optional içinde veri var mı kontrol et
        assertThat(result.get().getName()).isEqualTo("Bundesliga");

        // Verify repository was called
        verify(leagueRepository, times(1)).findById(1L);
    }

    @Test
    void shouldSaveNewLeague() {
        // Arrange
        LeagueEntity league = new LeagueEntity();
        league.setId(3L);
        league.setName("Serie A");
        
        when(leagueRepository.save(any(LeagueEntity.class))).thenReturn(league);

        // Act
        LeagueEntity savedLeague = leagueService.createLeague(league);

        // Assert
        assertThat(savedLeague.getName()).isEqualTo("Serie A");

        // Verify repository was called
        verify(leagueRepository, times(1)).save(any(LeagueEntity.class));
    }
    
    
    
    
    

	
    
    
    
    
	

}
