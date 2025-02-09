package domain.impl;

import domain.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.TeamEntity;
import persistence.TeamRepository;
import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService{
	
	private final TeamRepository teamRepository;

    @Autowired
    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public List<TeamEntity> getTeamsByLeague(Long leagueId) {
        return teamRepository.findByLeagueId(leagueId);
    }

    @Override
    public Optional<TeamEntity> getTeamById(Long id) {
        return teamRepository.findById(id);
    }

    @Override
    public TeamEntity createTeam(TeamEntity team) {
        return teamRepository.save(team);
    }

    @Override
    public TeamEntity updateTeam(Long id, TeamEntity updatedTeam) {
        return teamRepository.findById(id).map(existingTeam -> {
            existingTeam.setName(updatedTeam.getName());
            existingTeam.setLeague(updatedTeam.getLeague());
            return teamRepository.save(existingTeam);
        }).orElseThrow(() -> new RuntimeException("Team not found!"));
    }

    @Override
    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }

}
