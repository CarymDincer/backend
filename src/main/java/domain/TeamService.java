package domain;

import persistence.TeamEntity;
import java.util.List;
import java.util.Optional;

public interface TeamService {
	List<TeamEntity> getTeamsByLeague(Long leagueId);
    Optional<TeamEntity> getTeamById(Long id);
    TeamEntity createTeam(TeamEntity team);
    TeamEntity updateTeam(Long id, TeamEntity updatedTeam);
    void deleteTeam(Long id);

}
