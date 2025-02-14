package integrationTest;

import domain.impl.LeagueServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import persistence.LeagueEntity;
import persistence.LeagueRepository;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = com.behindthegoal.Main.class)  // ✅ Ana sınıfı belirttik
public class LeagueServiceIT {

    @Autowired
    private LeagueRepository leagueRepository;

    @Autowired
    private LeagueServiceImpl leagueService;

    @Test
    void shouldRetrieveLeagues() {
        // Arrange: Veritabanına test verisi ekleyelim
        LeagueEntity league1 = new LeagueEntity();
        league1.setName("Premier League");
        league1.setCountry("England");
        leagueRepository.save(league1);

        LeagueEntity league2 = new LeagueEntity();
        league2.setName("La Liga");
        league2.setCountry("Spain");
        leagueRepository.save(league2);

        // Act: Veritabanındaki tüm ligleri al
        List<LeagueEntity> leagues = leagueService.getAllLeagues();

        // Assert: Liglerin başarıyla getirildiğini doğrula
        assertThat(leagues).hasSize(2);
        assertThat(leagues.get(0).getName()).isEqualTo("Premier League");
        assertThat(leagues.get(1).getName()).isEqualTo("La Liga");
    }

    @Test
    void shouldRetrieveLeagueById() {
        // Arrange: Bir lig ekleyelim
        LeagueEntity league = new LeagueEntity();
        league.setName("Bundesliga");
        league.setCountry("Germany");

        league = leagueRepository.save(league);

        // Act: ID ile ligi getir
        Optional<LeagueEntity> retrievedLeague = leagueService.getLeagueById(league.getId());

        // Assert: Ligin doğru şekilde getirildiğini doğrula
        assertThat(retrievedLeague).isPresent();
        assertThat(retrievedLeague.get().getName()).isEqualTo("Bundesliga");
        assertThat(retrievedLeague.get().getCountry()).isEqualTo("Germany");
    }
}
