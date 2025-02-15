package persistence;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface LeagueRepository extends JpaRepository<LeagueEntity, Long>{
	 @Query("SELECT l FROM LeagueEntity l WHERE l.name = :name")
	Optional<LeagueEntity> findByName(String name);

}
