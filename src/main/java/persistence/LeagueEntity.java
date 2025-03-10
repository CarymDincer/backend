package persistence;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "leagues")
public class LeagueEntity {
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "league_id")
    private Long id;

    @Column(name = "league_name",nullable = false, unique = true)
    private String name;

    @Column(name = "country",nullable = false)
    private String country;

    @OneToMany(mappedBy = "league", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TeamEntity> teams = new ArrayList<>();

    @OneToMany(mappedBy = "league", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TeamStatsEntity> teamStats = new ArrayList<>();

    
    public LeagueEntity() {}
    
    public LeagueEntity(String name, String country) {
        this.name = name;
        this.country = country;
    }
    
    
    
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<TeamEntity> getTeams() {
		return teams;
	}

	public void setTeams(List<TeamEntity> teams) {
		this.teams = teams;
	}

	public List<TeamStatsEntity> getTeamStats() {
		return teamStats;
	}

	public void setTeamStats(List<TeamStatsEntity> teamStats) {
		this.teamStats = teamStats;
	}

}
