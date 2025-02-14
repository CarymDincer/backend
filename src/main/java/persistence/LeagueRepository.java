package persistence;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LeagueRepository extends JpaRepository<LeagueEntity, Long>{
	
	Optional<LeagueEntity> findByName(String name);

}
