package integrationTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.behindthegoal.Main;
import persistence.LeagueEntity;
import persistence.LeagueRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Main.class)
@Testcontainers  // Testcontainers entegrasyonu
@TestPropertySource(locations = "classpath:application-test.properties")  // Test config dosyasını kullan
public class LeagueServiceIT {

    @Autowired
    private LeagueRepository leagueRepository;

    @Container
    private static final PostgreSQLContainer<?> postgresContainer = new PostgreSQLContainer<>("postgres:15")
            .withDatabaseName("testdb")
            .withUsername("test")
            .withPassword("test");

    @BeforeAll
    static void setupDatabase() {
        postgresContainer.start();
        System.setProperty("spring.datasource.url", postgresContainer.getJdbcUrl());
        System.setProperty("spring.datasource.username", postgresContainer.getUsername());
        System.setProperty("spring.datasource.password", postgresContainer.getPassword());
    }

    @BeforeEach
    void cleanDatabase() {
        leagueRepository.deleteAll(); // Her test öncesi temizleme
    }

    @Test
    void shouldSaveAndRetrieveLeagues() {
    	LeagueEntity league1 = new LeagueEntity();
    	league1.setName("Premier League");
    	league1.setCountry("England");
    	
    	
    	LeagueEntity league2 = new LeagueEntity();
    	league2.setName("La Liga");
    	league2.setCountry("England");
    	

        leagueRepository.save(league2);
        leagueRepository.save(league1);
      
        List<LeagueEntity> leagues = leagueRepository.findAll();
        assertThat(leagues).hasSize(2);
    }

   
}
