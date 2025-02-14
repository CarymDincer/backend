package domain.impl;

import domain.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.MatchEntity;
import persistence.MatchRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class MatchServiceImpl implements MatchService{
	
	private final MatchRepository matchRepository;

    @Autowired
    public MatchServiceImpl(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public List<MatchEntity> getMatchesByLeague(Long leagueId) {
        return matchRepository.findByLeagueId(leagueId);
    }

    @Override
    public Optional<MatchEntity> getMatchById(Long id) {
        return matchRepository.findById(id);
    }
    @Override
    public Page<MatchEntity> getMatchesByLeagueWithPagination(Long leagueId, Pageable pageable) {
        return matchRepository.findByLeagueId(leagueId, pageable);
    }

}
