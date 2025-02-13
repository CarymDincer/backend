package domain.impl;

import domain.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.LeagueEntity;
import persistence.LeagueRepository;
import java.util.List;
import java.util.Optional;

@Service
public class LeagueServiceImpl implements LeagueService{
	
	private final LeagueRepository leagueRepository;

    @Autowired
    public LeagueServiceImpl(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    @Override
    public List<LeagueEntity> getAllLeagues() {
        return leagueRepository.findAll();
    }

    @Override
    public Optional<LeagueEntity> getLeagueById(Long id) {
        return leagueRepository.findById(id);
    }



    

}
