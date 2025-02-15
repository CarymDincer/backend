package domain.impl;

import domain.MatchStatsService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

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

    @Transactional
    @Override
    public MatchStatsEntity createMatchStats(MatchStatsEntity matchStats) {
        return matchStatsRepository.save(matchStats);
    }
    
    
    
    @Transactional
    public MatchStatsEntity updateMatchStats(Long id, MatchStatsEntity matchStats) {
        System.out.println("Checking if MatchStatsEntity with ID " + id + " exists...");
        if (!matchStatsRepository.existsById(id)) {
            throw new EntityNotFoundException("MatchStatsEntity with ID " + id + " does not exist!");
        }

        System.out.println("Fetching MatchStatsEntity with lock...");
        MatchStatsEntity existingStats = matchStatsRepository.findByIdWithLock(id)
            .orElseThrow(() -> new EntityNotFoundException("MatchStatsEntity not found"));

        System.out.println("Updating MatchStatsEntity...");
        existingStats.setGoals(matchStats.getGoals());
        existingStats.setShots(matchStats.getShots());
        existingStats.setShotsOnTarget(matchStats.getShotsOnTarget());
        existingStats.setPossession(matchStats.getPossession());
        existingStats.setFoulsCommitted(matchStats.getFoulsCommitted());
        existingStats.setYellowCards(matchStats.getYellowCards());
        existingStats.setRedCards(matchStats.getRedCards());

        return matchStatsRepository.save(existingStats);
    }

    

}
