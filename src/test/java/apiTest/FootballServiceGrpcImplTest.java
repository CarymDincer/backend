package apiTest;

import static org.assertj.core.api.Assertions.assertThat;

import api.grpc.FootballServiceGrpcImpl;

import com.behindthegoal.grpc.Empty;
import com.behindthegoal.grpc.FootballServiceGrpc;
import com.behindthegoal.grpc.LeagueListResponse;
import com.behindthegoal.grpc.LeagueRequest;
import com.behindthegoal.grpc.Match;
import com.behindthegoal.grpc.MatchListResponse;
import com.behindthegoal.grpc.MatchStats;
import com.behindthegoal.grpc.MatchStatsRequest;
import com.behindthegoal.grpc.MatchStatsResponse;
import com.behindthegoal.grpc.Team;
import com.behindthegoal.grpc.TeamListResponse;

import io.grpc.ManagedChannel;

import io.grpc.Server;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.io.IOException;

public class FootballServiceGrpcImplTest {
	
	
    private Server inProcessServer;
    private ManagedChannel inProcessChannel;
    private FootballServiceGrpcImpl footballService;
    
    
    
    @BeforeEach
    void setup() throws IOException {
        // gRPC Server'ı mockluyoruz
        footballService = Mockito.spy(new FootballServiceGrpcImpl());

        String uniqueServerName = InProcessServerBuilder.generateName();
        inProcessServer = InProcessServerBuilder
                .forName(uniqueServerName)
                .directExecutor()
                .addService(footballService)
                .build()
                .start();

        inProcessChannel = InProcessChannelBuilder.forName(uniqueServerName).directExecutor().build();
    }

    @AfterEach
    void teardown() throws InterruptedException {
        inProcessServer.shutdownNow();
        inProcessChannel.shutdownNow();
    }

    @Test
    void shouldReturnLeagueList() {
        // Arrange: Mock League List Response
        LeagueListResponse response = LeagueListResponse.newBuilder().build();
        Mockito.doAnswer(invocation -> {
            StreamObserver<LeagueListResponse> observer = invocation.getArgument(1);
            observer.onNext(response);
            observer.onCompleted();
            return null;
        }).when(footballService).listLeagues(Mockito.any(), Mockito.any());

        // Act: gRPC İstemcisi üzerinden çağrı yapıyoruz
        FootballServiceGrpc.FootballServiceBlockingStub stub = FootballServiceGrpc.newBlockingStub(inProcessChannel);
        LeagueListResponse result = stub.listLeagues(Empty.newBuilder().build());


        // Assert: Yanıtın beklenen formatta geldiğini doğruluyoruz
        assertThat(result).isNotNull();
    }
    
    @Test
    void shouldReturnTeamsByLeague() {
        // Arrange: Mock League Teams Response
        TeamListResponse response = TeamListResponse.newBuilder()
                .addTeams(Team.newBuilder()
                        .setId(1)
                        .setName("Manchester United")
                        .setLeagueId(1001)
                        .build())
                .addTeams(Team.newBuilder()
                        .setId(2)
                        .setName("Chelsea FC")
                        .setLeagueId(1001)
                        .build())
                .build();

        Mockito.doAnswer(invocation -> {
            StreamObserver<TeamListResponse> observer = invocation.getArgument(1);
            observer.onNext(response);
            observer.onCompleted();
            return null;
        }).when(footballService).listTeams(Mockito.any(LeagueRequest.class), Mockito.any());

        // Act: gRPC İstemcisi üzerinden çağrı yapıyoruz
        FootballServiceGrpc.FootballServiceBlockingStub stub = FootballServiceGrpc.newBlockingStub(inProcessChannel);
        LeagueRequest request = LeagueRequest.newBuilder().setLeagueId(1001).build();
        TeamListResponse result = stub.listTeams(request);

        // Assert: Yanıtın beklenen formatta geldiğini doğruluyoruz
        assertThat(result).isNotNull();
        assertThat(result.getTeamsList()).hasSize(2);
        assertThat(result.getTeamsList().get(0).getName()).isEqualTo("Manchester United");
        assertThat(result.getTeamsList().get(1).getName()).isEqualTo("Chelsea FC");
    }
   
    @Test
    void shouldCreateTeam() {
        // Arrange: Mock Team Creation Response
        Team request = Team.newBuilder()
                .setName("FC Barcelona")
                .setLeagueId(1001)
                .build();

        Team response = Team.newBuilder()
                .setId(10)  // Yeni oluşturulan takımın ID'si (simüle ediyoruz)
                .setName("FC Barcelona")
                .setLeagueId(1001)
                .build();

        Mockito.doAnswer(invocation -> {
            StreamObserver<Team> observer = invocation.getArgument(1);
            observer.onNext(response);
            observer.onCompleted();
            return null;
        }).when(footballService).createTeam(Mockito.any(Team.class), Mockito.any());

        // Act: gRPC İstemcisi üzerinden çağrı yapıyoruz
        FootballServiceGrpc.FootballServiceBlockingStub stub = FootballServiceGrpc.newBlockingStub(inProcessChannel);
        Team result = stub.createTeam(request);

        // Assert: Yanıtın beklenen formatta geldiğini doğruluyoruz
        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(10);
        assertThat(result.getName()).isEqualTo("FC Barcelona");
        assertThat(result.getLeagueId()).isEqualTo(1001);
    }

    @Test
    void shouldUpdateTeam() {
        // Arrange: Mock Updated Team Response
        Team request = Team.newBuilder()
                .setId(10)
                .setName("Updated FC Barcelona")
                .setLeagueId(1001)
                .build();

        Team response = Team.newBuilder()
                .setId(10)
                .setName("Updated FC Barcelona")
                .setLeagueId(1001)
                .build();

        Mockito.doAnswer(invocation -> {
            StreamObserver<Team> observer = invocation.getArgument(1);
            observer.onNext(response);
            observer.onCompleted();
            return null;
        }).when(footballService).updateTeam(Mockito.any(Team.class), Mockito.any());

        // Act: gRPC İstemcisi üzerinden çağrı yapıyoruz
        FootballServiceGrpc.FootballServiceBlockingStub stub = FootballServiceGrpc.newBlockingStub(inProcessChannel);
        Team result = stub.updateTeam(request);

        // Assert: Yanıtın beklenen formatta geldiğini doğruluyoruz
        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(10);
        assertThat(result.getName()).isEqualTo("Updated FC Barcelona");
        assertThat(result.getLeagueId()).isEqualTo(1001);
    }

    @Test
    void shouldDeleteTeam() {
        // Arrange: Mock Empty Response
        LeagueRequest request = LeagueRequest.newBuilder()
                .setLeagueId(1001)
                .build();

        Mockito.doAnswer(invocation -> {
            StreamObserver<Empty> observer = invocation.getArgument(1);
            observer.onNext(Empty.newBuilder().build());
            observer.onCompleted();
            return null;
        }).when(footballService).deleteTeam(Mockito.any(LeagueRequest.class), Mockito.any());

        // Act: gRPC İstemcisi üzerinden çağrı yapıyoruz
        FootballServiceGrpc.FootballServiceBlockingStub stub = FootballServiceGrpc.newBlockingStub(inProcessChannel);
        Empty result = stub.deleteTeam(request);

        // Assert: Yanıtın boş olduğunu doğruluyoruz
        assertThat(result).isNotNull();
    }

    @Test
    void shouldReturnMatchesByLeague() {
        // Arrange: Mock Match List Response
        MatchListResponse response = MatchListResponse.newBuilder()
                .addMatches(Match.newBuilder()
                        .setId(1)
                        .setHomeTeamId(101)
                        .setAwayTeamId(102)
                        .setHomeTeamScore(2)
                        .setAwayTeamScore(1)
                        .setMatchDate("2024-02-14")
                        .build())
                .build();

        Mockito.doAnswer(invocation -> {
            StreamObserver<MatchListResponse> observer = invocation.getArgument(1);
            observer.onNext(response);
            observer.onCompleted();
            return null;
        }).when(footballService).getMatchesByLeague(Mockito.any(LeagueRequest.class), Mockito.any());

        // Act: gRPC İstemcisi üzerinden çağrı yapıyoruz
        FootballServiceGrpc.FootballServiceBlockingStub stub = FootballServiceGrpc.newBlockingStub(inProcessChannel);
        LeagueRequest request = LeagueRequest.newBuilder().setLeagueId(1001).build();
        MatchListResponse result = stub.getMatchesByLeague(request);

        // Assert: Yanıtın beklenen formatta geldiğini doğruluyoruz
        assertThat(result).isNotNull();
        assertThat(result.getMatchesList()).hasSize(1);
        assertThat(result.getMatchesList().get(0).getHomeTeamScore()).isEqualTo(2);
    }

    @Test
    void shouldReturnMatchStats() {
        // Arrange: Mock Match Stats Response
        MatchStatsResponse response = MatchStatsResponse.newBuilder()
                .addMatchStats(MatchStats.newBuilder()
                        .setMatchId(1)
                        .setTeamId(101)
                        .setGoals(2)
                        .setShots(10)
                        .build())
                .build();

        Mockito.doAnswer(invocation -> {
            StreamObserver<MatchStatsResponse> observer = invocation.getArgument(1);
            observer.onNext(response);
            observer.onCompleted();
            return null;
        }).when(footballService).getMatchStats(Mockito.any(MatchStatsRequest.class), Mockito.any());

        // Act: gRPC İstemcisi üzerinden çağrı yapıyoruz
        FootballServiceGrpc.FootballServiceBlockingStub stub = FootballServiceGrpc.newBlockingStub(inProcessChannel);
        MatchStatsRequest request = MatchStatsRequest.newBuilder().setMatchId(1).build();
        MatchStatsResponse result = stub.getMatchStats(request);

        // Assert: Yanıtın beklenen formatta geldiğini doğruluyoruz
        assertThat(result).isNotNull();
        assertThat(result.getMatchStatsList()).hasSize(1);
        assertThat(result.getMatchStatsList().get(0).getGoals()).isEqualTo(2);
    }

    
}
