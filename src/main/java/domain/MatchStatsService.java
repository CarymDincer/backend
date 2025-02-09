package domain;

import persistence.MatchStatsEntity;
import java.util.List;
import java.util.Optional;

public interface MatchStatsService {
	
	List<MatchStatsEntity> getMatchStatsByMatch(Long matchId);
    Optional<MatchStatsEntity> getMatchStatsById(Long id);
    MatchStatsEntity createMatchStats(MatchStatsEntity matchStats);
    MatchStatsEntity updateMatchStats(Long id,MatchStatsEntity matchStats);
	

}
