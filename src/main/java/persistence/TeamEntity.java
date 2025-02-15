package persistence;
import java.util.*;
import jakarta.persistence.*;

@Entity
@Table(name = "TEAMS")
public class TeamEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "team_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "league_id", nullable = false)
    private LeagueEntity league;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MatchStatsEntity> matchStats = new ArrayList<>();

    @OneToOne(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private TeamStatsEntity teamStats;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LeagueEntity getLeague() {
		return league;
	}

	public void setLeague(LeagueEntity league) {
		this.league = league;
	}

	public List<MatchStatsEntity> getMatchStats() {
		return matchStats;
	}

	public void setMatchStats(List<MatchStatsEntity> matchStats) {
		this.matchStats = matchStats;
	}

	public TeamStatsEntity getTeamStats() {
		return teamStats;
	}

	public void setTeamStats(TeamStatsEntity teamStats) {
		this.teamStats = teamStats;
	}

}
