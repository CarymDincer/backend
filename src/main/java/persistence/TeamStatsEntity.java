package persistence;

import com.behindthegoal.grpc.TeamStats;

import jakarta.persistence.*;

@Entity
@Table(name = "TEAM_STATS")
public class TeamStatsEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "team_id", nullable = false, unique = true)
    private TeamEntity team;

    @ManyToOne
    @JoinColumn(name = "league_id", nullable = false)
    private LeagueEntity league;

    private int matchesPlayed;
    private int wins;
    private int draws;
    private int losses;
    private int goalsScored;
    private int goalsConceded;
    private int points;
    private int goalDifference;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TeamEntity getTeam() {
		return team;
	}
	public void setTeam(TeamEntity team) {
		this.team = team;
	}
	public LeagueEntity getLeague() {
		return league;
	}
	public void setLeague(LeagueEntity league) {
		this.league = league;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getDraws() {
		return draws;
	}
	public void setDraws(int draws) {
		this.draws = draws;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getGoalsScored() {
		return goalsScored;
	}
	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}
	public int getGoalsConceded() {
		return goalsConceded;
	}
	public void setGoalsConceded(int goalsConceded) {
		this.goalsConceded = goalsConceded;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getGoalDifference() {
		return goalDifference;
	}
	public void setGoalDifference(int goalDifference) {
		this.goalDifference = goalDifference;
	}
	// ✅ gRPC'den gelen TeamStats nesnesini TeamStatsEntity'ye çeviren metot
    public static TeamStatsEntity fromProto(TeamStats request, TeamEntity team, LeagueEntity league) {
        TeamStatsEntity entity = new TeamStatsEntity();
        entity.setTeam(team);
        entity.setLeague(league);
        entity.setMatchesPlayed(request.getMatchesPlayed());
        entity.setWins(request.getWins());
        entity.setDraws(request.getDraws());
        entity.setLosses(request.getLosses());
        entity.setGoalsScored(request.getGoalsScored());
        entity.setGoalsConceded(request.getGoalsConceded());
        entity.setPoints(request.getPoints());
        entity.setGoalDifference(request.getGoalDifference());
        return entity;
    }

}
