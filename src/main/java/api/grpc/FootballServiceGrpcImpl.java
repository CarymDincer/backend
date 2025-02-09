package api.grpc;

import com.behindthegoal.grpc.*;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.TeamService;
import domain.LeagueService;
import persistence.TeamRepository;
import persistence.LeagueEntity;
import persistence.LeagueRepository;
import persistence.MatchStatsEntity;
import persistence.MatchStatsRepository;
import persistence.TeamEntity;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FootballServiceGrpcImpl extends FootballServiceGrpc.FootballServiceImplBase{
	@Autowired
    private TeamService teamService;  // Persistence yerine domain service kullanıyoruz

    @Autowired
    private LeagueRepository leagueRepository;
    private MatchStatsRepository matchStatsRepository;

    @Override
    public void listLeagues(Empty request, StreamObserver<LeagueListResponse> responseObserver) {
        List<LeagueEntity> leagues = leagueRepository.findAll();
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
        List<TeamEntity> teams = teamService.getTeamsByLeague(request.getLeagueId());  // ✅ Persistence yerine Service çağrılıyor!
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
    public void getMatchStats(MatchStatsRequest request, StreamObserver<MatchStatsResponse> responseObserver) {
        Long matchId = request.getMatchId();

        List<MatchStatsEntity> statsEntities = matchStatsRepository.findByMatchId(matchId);

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

}
