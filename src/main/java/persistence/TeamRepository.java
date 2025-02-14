package persistence;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Long>{
	
	List<TeamEntity> findByLeague(LeagueEntity league);
	List<TeamEntity> findByLeagueId(Long leagueId);

}
