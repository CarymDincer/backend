package domain;

import persistence.LeagueEntity;
import java.util.List;
import java.util.Optional;

public interface LeagueService {
	List<LeagueEntity> getAllLeagues();
    Optional<LeagueEntity> getLeagueById(Long id);
    

}
