package api.grpc;

import com.behindthegoal.grpc.*;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.*;
import persistence.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FootballServiceGrpcImpl extends FootballServiceGrpc.FootballServiceImplBase{
	@Autowired
    public TeamService teamService;
    @Autowired
    public LeagueService leagueService; 
    @Autowired
    public MatchStatsService matchStatsService;
    @Autowired
    public TeamStatsService teamStatsService;
    @Autowired
    public MatchService matchService;

    @Override
    public void listLeagues(Empty request, StreamObserver<LeagueListResponse> responseObserver) {
        List<LeagueEntity> leagues = leagueService.getAllLeagues();
        LeagueListResponse response = LeagueListResponse.newBuilder()
                .addAllLeagues(
                        leagues.stream().map(league ->
                                League.newBuilder()
                                        .setId(league.getId())
                                        .setName(league.getName())
                                        .setCountry(league.getCountry())
                                        .build()
                        ).collect(Collectors.toList())
                )
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listTeams(LeagueRequest request, StreamObserver<TeamListResponse> responseObserver) {
        List<TeamEntity> teams = teamService.getTeamsByLeague(request.getLeagueId()); 
        TeamListResponse response = TeamListResponse.newBuilder()
                .addAllTeams(
                        teams.stream().map(team ->
                                Team.newBuilder()
                                        .setId(team.getId())
                                        .setName(team.getName())
                                        .setLeagueId(team.getLeague().getId())
                                        .build()
                        ).collect(Collectors.toList())
                )
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    @Override
    public void createTeam(Team request, StreamObserver<Team> responseObserver) {
        TeamEntity newTeam = new TeamEntity();
        newTeam.setName(request.getName());

        TeamEntity savedTeam = teamService.createTeam(newTeam);

        Team response = Team.newBuilder()
                .setId(savedTeam.getId())
                .setName(savedTeam.getName())
                .setLeagueId(savedTeam.getLeague().getId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    @Override
    public void updateTeam(Team request, StreamObserver<Team> responseObserver) {
        TeamEntity updatedTeam = new TeamEntity();
        updatedTeam.setId(request.getId());
        updatedTeam.setName(request.getName());

        TeamEntity savedTeam = teamService.updateTeam(request.getId(), updatedTeam);

        Team response = Team.newBuilder()
                .setId(savedTeam.getId())
                .setName(savedTeam.getName())
                .setLeagueId(savedTeam.getLeague().getId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    @Override
    public void deleteTeam(LeagueRequest request, StreamObserver<Empty> responseObserver) {
        teamService.deleteTeam(request.getLeagueId());

        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
    
    @Override
    public void getMatchesByLeague(LeagueRequest request, StreamObserver<MatchListResponse> responseObserver) {
        List<MatchEntity> matches = matchService.getMatchesByLeague(request.getLeagueId());

        MatchListResponse response = MatchListResponse.newBuilder()
                .addAllMatches(
                        matches.stream().map(match ->
                                Match.newBuilder()
                                        .setId(match.getId())
                                        .setHomeTeamId(match.getHomeTeam().getId())
                                        .setAwayTeamId(match.getAwayTeam().getId())
                                        .setHomeTeamScore(match.getHomeTeamScore())
                                        .setAwayTeamScore(match.getAwayTeamScore())
                                        .setMatchDate(match.getMatchDate())
                                        .build()
                        ).collect(Collectors.toList())
                )
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    @Override
    public void getMatchStats(MatchStatsRequest request, StreamObserver<MatchStatsResponse> responseObserver) {
        Long matchId = request.getMatchId();

        List<MatchStatsEntity> statsEntities = matchStatsService.getMatchStatsByMatch(matchId); 

        if (statsEntities.isEmpty()) {
            responseObserver.onError(new Exception("Match stats not found for match_id: " + matchId));
            return;
        }

        MatchStatsResponse response = MatchStatsResponse.newBuilder()
                .addAllMatchStats(
                        statsEntities.stream().map(stats ->
                                MatchStats.newBuilder()
                                        .setMatchId(stats.getMatch().getId())
                                        .setTeamId(stats.getTeam().getId())
                                        .setGoals(stats.getGoals())
                                        .setYellowCards(stats.getYellowCards())
                                        .setRedCards(stats.getRedCards())
                                        .setShots(stats.getShots())
                                        .setShotsOnTarget(stats.getShotsOnTarget())
                                        .setPossession(stats.getPossession())
                                        .setFoulsCommitted(stats.getFoulsCommitted())
                                        .build()
                        ).collect(Collectors.toList())
                )
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    @Override
    public void createMatchStats(MatchStats request, StreamObserver<MatchStats> responseObserver) {
        MatchStatsEntity matchStats = new MatchStatsEntity();
        matchStats.setGoals(request.getGoals());
        matchStats.setYellowCards(request.getYellowCards());
        matchStats.setRedCards(request.getRedCards());
        matchStats.setShots(request.getShots());
        matchStats.setShotsOnTarget(request.getShotsOnTarget());
        matchStats.setPossession(request.getPossession());
        matchStats.setFoulsCommitted(request.getFoulsCommitted());

        MatchStatsEntity savedStats = matchStatsService.createMatchStats(matchStats);

        MatchStats response = MatchStats.newBuilder()
                .setMatchId(savedStats.getMatch().getId())
                .setTeamId(savedStats.getTeam().getId())
                .setGoals(savedStats.getGoals())
                .setYellowCards(savedStats.getYellowCards())
                .setRedCards(savedStats.getRedCards())
                .setShots(savedStats.getShots())
                .setShotsOnTarget(savedStats.getShotsOnTarget())
                .setPossession(savedStats.getPossession())
                .setFoulsCommitted(savedStats.getFoulsCommitted())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    @Override
    public void getTeamStats(TeamStatsRequest request, StreamObserver<TeamStatsResponse> responseObserver) {
        Long teamId = request.getTeamId();
        Optional<TeamStatsEntity> teamStatsEntity = teamStatsService.getTeamStatsByTeam(teamId); 

        if (teamStatsEntity.isEmpty()) {
            responseObserver.onError(new Exception("Team stats not found for team_id: " + teamId));
            return;
        }

        TeamStatsEntity stats = teamStatsEntity.get();
        TeamStatsResponse response = TeamStatsResponse.newBuilder()
                .setTeamStats(TeamStats.newBuilder()
                        .setTeamId(stats.getTeam().getId())
                        .setLeagueId(stats.getLeague().getId())
                        .setMatchesPlayed(stats.getMatchesPlayed())
                        .setWins(stats.getWins())
                        .setDraws(stats.getDraws())
                        .setLosses(stats.getLosses())
                        .setGoalsScored(stats.getGoalsScored())
                        .setGoalsConceded(stats.getGoalsConceded())
                        .setPoints(stats.getPoints())
                        .setGoalDifference(stats.getGoalDifference())
                        .build()
                ).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    @Override
    public void updateMatchStats(MatchStats request, StreamObserver<MatchStats> responseObserver) {
        MatchStatsEntity updatedStats = new MatchStatsEntity();
        updatedStats.setGoals(request.getGoals());
        updatedStats.setYellowCards(request.getYellowCards());
        updatedStats.setRedCards(request.getRedCards());
        updatedStats.setShots(request.getShots());
        updatedStats.setShotsOnTarget(request.getShotsOnTarget());
        updatedStats.setPossession(request.getPossession());
        updatedStats.setFoulsCommitted(request.getFoulsCommitted());

        MatchStatsEntity savedStats = matchStatsService.updateMatchStats(request.getMatchId(), updatedStats);

        MatchStats response = MatchStats.newBuilder()
                .setMatchId(savedStats.getMatch().getId())
                .setTeamId(savedStats.getTeam().getId())
                .setGoals(savedStats.getGoals())
                .setYellowCards(savedStats.getYellowCards())
                .setRedCards(savedStats.getRedCards())
                .setShots(savedStats.getShots())
                .setShotsOnTarget(savedStats.getShotsOnTarget())
                .setPossession(savedStats.getPossession())
                .setFoulsCommitted(savedStats.getFoulsCommitted())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateTeamStats(TeamStats request, StreamObserver<TeamStats> responseObserver) {
        Optional<TeamStatsEntity> teamStatsEntity = teamStatsService.getTeamStatsByTeam(request.getTeamId());

        if (teamStatsEntity.isEmpty()) {
            responseObserver.onError(new Exception("Invalid team_id"));
            return;
        }

        TeamStatsEntity existingStats = teamStatsEntity.get();
        existingStats.setMatchesPlayed(request.getMatchesPlayed());
        existingStats.setWins(request.getWins());
        existingStats.setDraws(request.getDraws());
        existingStats.setLosses(request.getLosses());
        existingStats.setGoalsScored(request.getGoalsScored());
        existingStats.setGoalsConceded(request.getGoalsConceded());
        existingStats.setPoints(request.getPoints());
        existingStats.setGoalDifference(request.getGoalDifference());

        TeamStatsEntity savedStats = teamStatsService.updateTeamStats(existingStats); 

        TeamStats response = TeamStats.newBuilder()
                .setTeamId(savedStats.getTeam().getId())
                .setLeagueId(savedStats.getLeague().getId())
                .setMatchesPlayed(savedStats.getMatchesPlayed())
                .setWins(savedStats.getWins())
                .setDraws(savedStats.getDraws())
                .setLosses(savedStats.getLosses())
                .setGoalsScored(savedStats.getGoalsScored())
                .setGoalsConceded(savedStats.getGoalsConceded())
                .setPoints(savedStats.getPoints())
                .setGoalDifference(savedStats.getGoalDifference())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
