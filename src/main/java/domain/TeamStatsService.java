package domain;

import java.util.Optional;
import persistence.TeamStatsEntity;

public interface TeamStatsService {
	
	Optional<TeamStatsEntity> getTeamStatsByTeam(Long teamId);
    TeamStatsEntity updateTeamStats(TeamStatsEntity teamStats);

}
