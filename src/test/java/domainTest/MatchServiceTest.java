package domainTest;


import domain.impl.MatchServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import persistence.MatchEntity;
import persistence.MatchRepository;

import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class MatchServiceTest {
	
	 @Mock
	    private MatchRepository matchRepository;

	    @InjectMocks
	    private MatchServiceImpl matchService;

	    @BeforeEach
	    void setUp() {
	        MockitoAnnotations.openMocks(this);
	    }
	    
	    @Test
	    void shouldReturnAllMatches() {
	        // Arrange
	        MatchEntity match1 = new MatchEntity();
	        match1.setId(1L);
	        
	        MatchEntity match2 = new MatchEntity();
	        match2.setId(2L);
	        
	        when(matchRepository.findAll()).thenReturn(Arrays.asList(match1, match2));

	        // Act
	        List<MatchEntity> matches = matchService.getAllMatches();

	        // Assert
	        assertThat(matches).hasSize(2);

	        // Verify repository was called
	        verify(matchRepository, times(1)).findAll();
	    }
	
	    @Test
	    void shouldReturnMatchById() {
	        // Arrange
	        MatchEntity match = new MatchEntity();
	        match.setId(1L);

	        when(matchRepository.findById(1L)).thenReturn(Optional.of(match));

	        // Act
	        Optional<MatchEntity> result = matchService.getMatchById(1L);

	        // Assert
	        assertThat(result).isPresent();

	        // Verify repository was called
	        verify(matchRepository, times(1)).findById(1L);
	    }
	    
	    @Test
	    void shouldReturnMatchesByLeague() {
	        // Arrange
	        MatchEntity match1 = new MatchEntity();
	        match1.setId(1L);
	        
	        MatchEntity match2 = new MatchEntity();
	        match2.setId(2L);
	        
	        when(matchRepository.findByLeagueId(1L)).thenReturn(Arrays.asList(match1, match2));

	        // Act
	        List<MatchEntity> matches = matchService.getMatchesByLeague(1L);

	        // Assert
	        assertThat(matches).hasSize(2);

	        // Verify repository was called
	        verify(matchRepository, times(1)).findByLeagueId(1L);
	    }
	
	
	

}
