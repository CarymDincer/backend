package persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamStatsRepository extends JpaRepository<TeamStatsEntity, Long>{

	Optional<TeamStatsEntity> findByTeam(TeamEntity team);
}
