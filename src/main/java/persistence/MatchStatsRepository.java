package persistence;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.persistence.LockModeType;

@Repository
public interface MatchStatsRepository extends JpaRepository<MatchStatsEntity, Long>{
	
	List<MatchStatsEntity> findByMatch(MatchEntity match);
    List<MatchStatsEntity> findByTeam(TeamEntity team);
    List<MatchStatsEntity> findByMatchId(long id);
    
    @Query("SELECT m FROM MatchStatsEntity m WHERE m.id = :id FOR UPDATE")
    @Lock(LockModeType.PESSIMISTIC_WRITE)  
    Optional<MatchStatsEntity> findByIdWithLock(@Param("id") Long id);


    
    @Query("SELECT m FROM MatchStatsEntity m WHERE m.id = :id")
    @Lock(LockModeType.PESSIMISTIC_READ)  
    Optional<MatchStatsEntity> findByIdWithReadLock(@Param("id") Long id);

}
