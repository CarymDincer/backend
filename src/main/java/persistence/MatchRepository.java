package persistence;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<MatchEntity, Long>{

	List<MatchEntity> findByLeague(LeagueEntity league);
	List<MatchEntity> findByLeagueId(Long id);
	Page<MatchEntity> findByLeagueId(Long leagueId, Pageable pageable);
}
