package domain;

import persistence.MatchEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MatchService {
	
	List<MatchEntity> getMatchesByLeague(Long leagueId);
    Optional<MatchEntity> getMatchById(Long id);
    Page<MatchEntity> getMatchesByLeagueWithPagination(Long leagueId, Pageable pageable);

    

}
