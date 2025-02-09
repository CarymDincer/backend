package domain;

import persistence.MatchEntity;
import java.util.List;
import java.util.Optional;

public interface MatchService {
	
	List<MatchEntity> getMatchesByLeague(Long leagueId);
    Optional<MatchEntity> getMatchById(Long id);
    

}
