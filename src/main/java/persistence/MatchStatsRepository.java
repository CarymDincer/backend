package persistence;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MatchStatsRepository extends JpaRepository<MatchStatsEntity, Long>{
	
	List<MatchStatsEntity> findByMatch(MatchEntity match);
    List<MatchStatsEntity> findByTeam(TeamEntity team);
    List<MatchStatsEntity> findByMatchId(long id);

}
