package persistence;
import jakarta.persistence.*;

@Entity
@Table(name = "match_stats")
public class MatchStatsEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "match_id", nullable = false)
    private MatchEntity match;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private TeamEntity team;

    private int goals;
    private int yellowCards;
    private int redCards;
    private int shots;
    private int shotsOnTarget;
    private int possession;
    private int foulsCommitted;

}
