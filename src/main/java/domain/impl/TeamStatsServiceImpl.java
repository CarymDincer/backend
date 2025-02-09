package domain.impl;

import domain.TeamStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.TeamStatsEntity;
import persistence.TeamStatsRepository;
import persistence.TeamRepository;
import java.util.Optional;

@Service
public class TeamStatsServiceImpl implements TeamStatsService{
	
	private final TeamStatsRepository teamStatsRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public TeamStatsServiceImpl(TeamStatsRepository teamStatsRepository, TeamRepository teamRepository) {
        this.teamStatsRepository = teamStatsRepository;
        this.teamRepository = teamRepository;
    }

    @Override
    public Optional<TeamStatsEntity> getTeamStatsByTeam(Long teamId) {
        return teamRepository.findById(teamId)
                .flatMap(teamStatsRepository::findByTeam);
    }

    @Override
    public TeamStatsEntity updateTeamStats(TeamStatsEntity teamStats) {
        return teamStatsRepository.findByTeam(teamStats.getTeam())
                .map(existingStats -> {
                    existingStats.setMatchesPlayed(teamStats.getMatchesPlayed());
                    existingStats.setWins(teamStats.getWins());
                    existingStats.setDraws(teamStats.getDraws());
                    existingStats.setLosses(teamStats.getLosses());
                    existingStats.setGoalsScored(teamStats.getGoalsScored());
                    existingStats.setGoalsConceded(teamStats.getGoalsConceded());
                    existingStats.setPoints(teamStats.getPoints());
                    existingStats.setGoalDifference(teamStats.getGoalDifference());
                    return teamStatsRepository.save(existingStats);
                })
                .orElseGet(() -> teamStatsRepository.save(teamStats));
    }


}
