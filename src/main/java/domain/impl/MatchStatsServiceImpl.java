package domain.impl;

import domain.MatchStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.MatchStatsEntity;
import persistence.MatchStatsRepository;
import java.util.List;
import java.util.Optional;

@Service
public class MatchStatsServiceImpl implements MatchStatsService{
	
	private final MatchStatsRepository matchStatsRepository;

    @Autowired
    public MatchStatsServiceImpl(MatchStatsRepository matchStatsRepository) {
        this.matchStatsRepository = matchStatsRepository;
    }

    @Override
    public List<MatchStatsEntity> getMatchStatsByMatch(Long matchId) {
        return matchStatsRepository.findByMatchId(matchId);
    }

    @Override
    public Optional<MatchStatsEntity> getMatchStatsById(Long id) {
        return matchStatsRepository.findById(id);
    }

    @Override
    public MatchStatsEntity createMatchStats(MatchStatsEntity matchStats) {
        return matchStatsRepository.save(matchStats);
    }
    @Override
    public MatchStatsEntity updateMatchStats(Long id, MatchStatsEntity updatedStats) {
        return matchStatsRepository.findById(id)
                .map(existingStats -> {
                    existingStats.setGoals(updatedStats.getGoals());
                    existingStats.setYellowCards(updatedStats.getYellowCards());
                    existingStats.setRedCards(updatedStats.getRedCards());
                    existingStats.setShots(updatedStats.getShots());
                    existingStats.setShotsOnTarget(updatedStats.getShotsOnTarget());
                    existingStats.setPossession(updatedStats.getPossession());
                    existingStats.setFoulsCommitted(updatedStats.getFoulsCommitted());
                    return matchStatsRepository.save(existingStats);
                })
                .orElseThrow(() -> new RuntimeException("Match Stats not found for ID: " + id));
    }
    

}
