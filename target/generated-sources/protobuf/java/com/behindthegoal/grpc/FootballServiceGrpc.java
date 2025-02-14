package com.behindthegoal.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: FootballService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FootballServiceGrpc {

  private FootballServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.grpc.FootballService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.behindthegoal.grpc.Empty,
      com.behindthegoal.grpc.LeagueListResponse> getListLeaguesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLeagues",
      requestType = com.behindthegoal.grpc.Empty.class,
      responseType = com.behindthegoal.grpc.LeagueListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.behindthegoal.grpc.Empty,
      com.behindthegoal.grpc.LeagueListResponse> getListLeaguesMethod() {
    io.grpc.MethodDescriptor<com.behindthegoal.grpc.Empty, com.behindthegoal.grpc.LeagueListResponse> getListLeaguesMethod;
    if ((getListLeaguesMethod = FootballServiceGrpc.getListLeaguesMethod) == null) {
      synchronized (FootballServiceGrpc.class) {
        if ((getListLeaguesMethod = FootballServiceGrpc.getListLeaguesMethod) == null) {
          FootballServiceGrpc.getListLeaguesMethod = getListLeaguesMethod =
              io.grpc.MethodDescriptor.<com.behindthegoal.grpc.Empty, com.behindthegoal.grpc.LeagueListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLeagues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.LeagueListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FootballServiceMethodDescriptorSupplier("ListLeagues"))
              .build();
        }
      }
    }
    return getListLeaguesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.behindthegoal.grpc.LeagueRequest,
      com.behindthegoal.grpc.TeamListResponse> getListTeamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTeams",
      requestType = com.behindthegoal.grpc.LeagueRequest.class,
      responseType = com.behindthegoal.grpc.TeamListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.behindthegoal.grpc.LeagueRequest,
      com.behindthegoal.grpc.TeamListResponse> getListTeamsMethod() {
    io.grpc.MethodDescriptor<com.behindthegoal.grpc.LeagueRequest, com.behindthegoal.grpc.TeamListResponse> getListTeamsMethod;
    if ((getListTeamsMethod = FootballServiceGrpc.getListTeamsMethod) == null) {
      synchronized (FootballServiceGrpc.class) {
        if ((getListTeamsMethod = FootballServiceGrpc.getListTeamsMethod) == null) {
          FootballServiceGrpc.getListTeamsMethod = getListTeamsMethod =
              io.grpc.MethodDescriptor.<com.behindthegoal.grpc.LeagueRequest, com.behindthegoal.grpc.TeamListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTeams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.LeagueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.TeamListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FootballServiceMethodDescriptorSupplier("ListTeams"))
              .build();
        }
      }
    }
    return getListTeamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.behindthegoal.grpc.Team,
      com.behindthegoal.grpc.Team> getCreateTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTeam",
      requestType = com.behindthegoal.grpc.Team.class,
      responseType = com.behindthegoal.grpc.Team.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.behindthegoal.grpc.Team,
      com.behindthegoal.grpc.Team> getCreateTeamMethod() {
    io.grpc.MethodDescriptor<com.behindthegoal.grpc.Team, com.behindthegoal.grpc.Team> getCreateTeamMethod;
    if ((getCreateTeamMethod = FootballServiceGrpc.getCreateTeamMethod) == null) {
      synchronized (FootballServiceGrpc.class) {
        if ((getCreateTeamMethod = FootballServiceGrpc.getCreateTeamMethod) == null) {
          FootballServiceGrpc.getCreateTeamMethod = getCreateTeamMethod =
              io.grpc.MethodDescriptor.<com.behindthegoal.grpc.Team, com.behindthegoal.grpc.Team>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.Team.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.Team.getDefaultInstance()))
              .setSchemaDescriptor(new FootballServiceMethodDescriptorSupplier("CreateTeam"))
              .build();
        }
      }
    }
    return getCreateTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.behindthegoal.grpc.Team,
      com.behindthegoal.grpc.Team> getUpdateTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTeam",
      requestType = com.behindthegoal.grpc.Team.class,
      responseType = com.behindthegoal.grpc.Team.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.behindthegoal.grpc.Team,
      com.behindthegoal.grpc.Team> getUpdateTeamMethod() {
    io.grpc.MethodDescriptor<com.behindthegoal.grpc.Team, com.behindthegoal.grpc.Team> getUpdateTeamMethod;
    if ((getUpdateTeamMethod = FootballServiceGrpc.getUpdateTeamMethod) == null) {
      synchronized (FootballServiceGrpc.class) {
        if ((getUpdateTeamMethod = FootballServiceGrpc.getUpdateTeamMethod) == null) {
          FootballServiceGrpc.getUpdateTeamMethod = getUpdateTeamMethod =
              io.grpc.MethodDescriptor.<com.behindthegoal.grpc.Team, com.behindthegoal.grpc.Team>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.Team.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.Team.getDefaultInstance()))
              .setSchemaDescriptor(new FootballServiceMethodDescriptorSupplier("UpdateTeam"))
              .build();
        }
      }
    }
    return getUpdateTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.behindthegoal.grpc.LeagueRequest,
      com.behindthegoal.grpc.Empty> getDeleteTeamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTeam",
      requestType = com.behindthegoal.grpc.LeagueRequest.class,
      responseType = com.behindthegoal.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.behindthegoal.grpc.LeagueRequest,
      com.behindthegoal.grpc.Empty> getDeleteTeamMethod() {
    io.grpc.MethodDescriptor<com.behindthegoal.grpc.LeagueRequest, com.behindthegoal.grpc.Empty> getDeleteTeamMethod;
    if ((getDeleteTeamMethod = FootballServiceGrpc.getDeleteTeamMethod) == null) {
      synchronized (FootballServiceGrpc.class) {
        if ((getDeleteTeamMethod = FootballServiceGrpc.getDeleteTeamMethod) == null) {
          FootballServiceGrpc.getDeleteTeamMethod = getDeleteTeamMethod =
              io.grpc.MethodDescriptor.<com.behindthegoal.grpc.LeagueRequest, com.behindthegoal.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTeam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.LeagueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FootballServiceMethodDescriptorSupplier("DeleteTeam"))
              .build();
        }
      }
    }
    return getDeleteTeamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.behindthegoal.grpc.LeagueRequest,
      com.behindthegoal.grpc.MatchListResponse> getGetMatchesByLeagueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMatchesByLeague",
      requestType = com.behindthegoal.grpc.LeagueRequest.class,
      responseType = com.behindthegoal.grpc.MatchListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.behindthegoal.grpc.LeagueRequest,
      com.behindthegoal.grpc.MatchListResponse> getGetMatchesByLeagueMethod() {
    io.grpc.MethodDescriptor<com.behindthegoal.grpc.LeagueRequest, com.behindthegoal.grpc.MatchListResponse> getGetMatchesByLeagueMethod;
    if ((getGetMatchesByLeagueMethod = FootballServiceGrpc.getGetMatchesByLeagueMethod) == null) {
      synchronized (FootballServiceGrpc.class) {
        if ((getGetMatchesByLeagueMethod = FootballServiceGrpc.getGetMatchesByLeagueMethod) == null) {
          FootballServiceGrpc.getGetMatchesByLeagueMethod = getGetMatchesByLeagueMethod =
              io.grpc.MethodDescriptor.<com.behindthegoal.grpc.LeagueRequest, com.behindthegoal.grpc.MatchListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMatchesByLeague"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.LeagueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.MatchListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FootballServiceMethodDescriptorSupplier("GetMatchesByLeague"))
              .build();
        }
      }
    }
    return getGetMatchesByLeagueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.behindthegoal.grpc.PaginatedLeagueRequest,
      com.behindthegoal.grpc.PaginatedMatchListResponse> getGetMatchesByLeaguePaginatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMatchesByLeaguePaginated",
      requestType = com.behindthegoal.grpc.PaginatedLeagueRequest.class,
      responseType = com.behindthegoal.grpc.PaginatedMatchListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.behindthegoal.grpc.PaginatedLeagueRequest,
      com.behindthegoal.grpc.PaginatedMatchListResponse> getGetMatchesByLeaguePaginatedMethod() {
    io.grpc.MethodDescriptor<com.behindthegoal.grpc.PaginatedLeagueRequest, com.behindthegoal.grpc.PaginatedMatchListResponse> getGetMatchesByLeaguePaginatedMethod;
    if ((getGetMatchesByLeaguePaginatedMethod = FootballServiceGrpc.getGetMatchesByLeaguePaginatedMethod) == null) {
      synchronized (FootballServiceGrpc.class) {
        if ((getGetMatchesByLeaguePaginatedMethod = FootballServiceGrpc.getGetMatchesByLeaguePaginatedMethod) == null) {
          FootballServiceGrpc.getGetMatchesByLeaguePaginatedMethod = getGetMatchesByLeaguePaginatedMethod =
              io.grpc.MethodDescriptor.<com.behindthegoal.grpc.PaginatedLeagueRequest, com.behindthegoal.grpc.PaginatedMatchListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMatchesByLeaguePaginated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.PaginatedLeagueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.PaginatedMatchListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FootballServiceMethodDescriptorSupplier("GetMatchesByLeaguePaginated"))
              .build();
        }
      }
    }
    return getGetMatchesByLeaguePaginatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.behindthegoal.grpc.MatchStatsRequest,
      com.behindthegoal.grpc.MatchStatsResponse> getGetMatchStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMatchStats",
      requestType = com.behindthegoal.grpc.MatchStatsRequest.class,
      responseType = com.behindthegoal.grpc.MatchStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.behindthegoal.grpc.MatchStatsRequest,
      com.behindthegoal.grpc.MatchStatsResponse> getGetMatchStatsMethod() {
    io.grpc.MethodDescriptor<com.behindthegoal.grpc.MatchStatsRequest, com.behindthegoal.grpc.MatchStatsResponse> getGetMatchStatsMethod;
    if ((getGetMatchStatsMethod = FootballServiceGrpc.getGetMatchStatsMethod) == null) {
      synchronized (FootballServiceGrpc.class) {
        if ((getGetMatchStatsMethod = FootballServiceGrpc.getGetMatchStatsMethod) == null) {
          FootballServiceGrpc.getGetMatchStatsMethod = getGetMatchStatsMethod =
              io.grpc.MethodDescriptor.<com.behindthegoal.grpc.MatchStatsRequest, com.behindthegoal.grpc.MatchStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMatchStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.MatchStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.MatchStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FootballServiceMethodDescriptorSupplier("GetMatchStats"))
              .build();
        }
      }
    }
    return getGetMatchStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.behindthegoal.grpc.MatchStats,
      com.behindthegoal.grpc.MatchStats> getCreateMatchStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMatchStats",
      requestType = com.behindthegoal.grpc.MatchStats.class,
      responseType = com.behindthegoal.grpc.MatchStats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.behindthegoal.grpc.MatchStats,
      com.behindthegoal.grpc.MatchStats> getCreateMatchStatsMethod() {
    io.grpc.MethodDescriptor<com.behindthegoal.grpc.MatchStats, com.behindthegoal.grpc.MatchStats> getCreateMatchStatsMethod;
    if ((getCreateMatchStatsMethod = FootballServiceGrpc.getCreateMatchStatsMethod) == null) {
      synchronized (FootballServiceGrpc.class) {
        if ((getCreateMatchStatsMethod = FootballServiceGrpc.getCreateMatchStatsMethod) == null) {
          FootballServiceGrpc.getCreateMatchStatsMethod = getCreateMatchStatsMethod =
              io.grpc.MethodDescriptor.<com.behindthegoal.grpc.MatchStats, com.behindthegoal.grpc.MatchStats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMatchStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.MatchStats.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.MatchStats.getDefaultInstance()))
              .setSchemaDescriptor(new FootballServiceMethodDescriptorSupplier("CreateMatchStats"))
              .build();
        }
      }
    }
    return getCreateMatchStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.behindthegoal.grpc.MatchStats,
      com.behindthegoal.grpc.MatchStats> getUpdateMatchStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMatchStats",
      requestType = com.behindthegoal.grpc.MatchStats.class,
      responseType = com.behindthegoal.grpc.MatchStats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.behindthegoal.grpc.MatchStats,
      com.behindthegoal.grpc.MatchStats> getUpdateMatchStatsMethod() {
    io.grpc.MethodDescriptor<com.behindthegoal.grpc.MatchStats, com.behindthegoal.grpc.MatchStats> getUpdateMatchStatsMethod;
    if ((getUpdateMatchStatsMethod = FootballServiceGrpc.getUpdateMatchStatsMethod) == null) {
      synchronized (FootballServiceGrpc.class) {
        if ((getUpdateMatchStatsMethod = FootballServiceGrpc.getUpdateMatchStatsMethod) == null) {
          FootballServiceGrpc.getUpdateMatchStatsMethod = getUpdateMatchStatsMethod =
              io.grpc.MethodDescriptor.<com.behindthegoal.grpc.MatchStats, com.behindthegoal.grpc.MatchStats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMatchStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.MatchStats.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.MatchStats.getDefaultInstance()))
              .setSchemaDescriptor(new FootballServiceMethodDescriptorSupplier("UpdateMatchStats"))
              .build();
        }
      }
    }
    return getUpdateMatchStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.behindthegoal.grpc.TeamStatsRequest,
      com.behindthegoal.grpc.TeamStatsResponse> getGetTeamStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTeamStats",
      requestType = com.behindthegoal.grpc.TeamStatsRequest.class,
      responseType = com.behindthegoal.grpc.TeamStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.behindthegoal.grpc.TeamStatsRequest,
      com.behindthegoal.grpc.TeamStatsResponse> getGetTeamStatsMethod() {
    io.grpc.MethodDescriptor<com.behindthegoal.grpc.TeamStatsRequest, com.behindthegoal.grpc.TeamStatsResponse> getGetTeamStatsMethod;
    if ((getGetTeamStatsMethod = FootballServiceGrpc.getGetTeamStatsMethod) == null) {
      synchronized (FootballServiceGrpc.class) {
        if ((getGetTeamStatsMethod = FootballServiceGrpc.getGetTeamStatsMethod) == null) {
          FootballServiceGrpc.getGetTeamStatsMethod = getGetTeamStatsMethod =
              io.grpc.MethodDescriptor.<com.behindthegoal.grpc.TeamStatsRequest, com.behindthegoal.grpc.TeamStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTeamStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.TeamStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.TeamStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FootballServiceMethodDescriptorSupplier("GetTeamStats"))
              .build();
        }
      }
    }
    return getGetTeamStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.behindthegoal.grpc.TeamStats,
      com.behindthegoal.grpc.TeamStats> getUpdateTeamStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTeamStats",
      requestType = com.behindthegoal.grpc.TeamStats.class,
      responseType = com.behindthegoal.grpc.TeamStats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.behindthegoal.grpc.TeamStats,
      com.behindthegoal.grpc.TeamStats> getUpdateTeamStatsMethod() {
    io.grpc.MethodDescriptor<com.behindthegoal.grpc.TeamStats, com.behindthegoal.grpc.TeamStats> getUpdateTeamStatsMethod;
    if ((getUpdateTeamStatsMethod = FootballServiceGrpc.getUpdateTeamStatsMethod) == null) {
      synchronized (FootballServiceGrpc.class) {
        if ((getUpdateTeamStatsMethod = FootballServiceGrpc.getUpdateTeamStatsMethod) == null) {
          FootballServiceGrpc.getUpdateTeamStatsMethod = getUpdateTeamStatsMethod =
              io.grpc.MethodDescriptor.<com.behindthegoal.grpc.TeamStats, com.behindthegoal.grpc.TeamStats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTeamStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.TeamStats.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.behindthegoal.grpc.TeamStats.getDefaultInstance()))
              .setSchemaDescriptor(new FootballServiceMethodDescriptorSupplier("UpdateTeamStats"))
              .build();
        }
      }
    }
    return getUpdateTeamStatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FootballServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FootballServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FootballServiceStub>() {
        @java.lang.Override
        public FootballServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FootballServiceStub(channel, callOptions);
        }
      };
    return FootballServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FootballServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FootballServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FootballServiceBlockingStub>() {
        @java.lang.Override
        public FootballServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FootballServiceBlockingStub(channel, callOptions);
        }
      };
    return FootballServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FootballServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FootballServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FootballServiceFutureStub>() {
        @java.lang.Override
        public FootballServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FootballServiceFutureStub(channel, callOptions);
        }
      };
    return FootballServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listLeagues(com.behindthegoal.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.LeagueListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLeaguesMethod(), responseObserver);
    }

    /**
     */
    default void listTeams(com.behindthegoal.grpc.LeagueRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.TeamListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTeamsMethod(), responseObserver);
    }

    /**
     */
    default void createTeam(com.behindthegoal.grpc.Team request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.Team> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTeamMethod(), responseObserver);
    }

    /**
     */
    default void updateTeam(com.behindthegoal.grpc.Team request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.Team> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTeamMethod(), responseObserver);
    }

    /**
     */
    default void deleteTeam(com.behindthegoal.grpc.LeagueRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTeamMethod(), responseObserver);
    }

    /**
     */
    default void getMatchesByLeague(com.behindthegoal.grpc.LeagueRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMatchesByLeagueMethod(), responseObserver);
    }

    /**
     */
    default void getMatchesByLeaguePaginated(com.behindthegoal.grpc.PaginatedLeagueRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.PaginatedMatchListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMatchesByLeaguePaginatedMethod(), responseObserver);
    }

    /**
     */
    default void getMatchStats(com.behindthegoal.grpc.MatchStatsRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMatchStatsMethod(), responseObserver);
    }

    /**
     */
    default void createMatchStats(com.behindthegoal.grpc.MatchStats request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchStats> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMatchStatsMethod(), responseObserver);
    }

    /**
     */
    default void updateMatchStats(com.behindthegoal.grpc.MatchStats request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchStats> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMatchStatsMethod(), responseObserver);
    }

    /**
     */
    default void getTeamStats(com.behindthegoal.grpc.TeamStatsRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.TeamStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeamStatsMethod(), responseObserver);
    }

    /**
     */
    default void updateTeamStats(com.behindthegoal.grpc.TeamStats request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.TeamStats> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTeamStatsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FootballService.
   */
  public static abstract class FootballServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FootballServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FootballService.
   */
  public static final class FootballServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FootballServiceStub> {
    private FootballServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FootballServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FootballServiceStub(channel, callOptions);
    }

    /**
     */
    public void listLeagues(com.behindthegoal.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.LeagueListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLeaguesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTeams(com.behindthegoal.grpc.LeagueRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.TeamListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTeamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTeam(com.behindthegoal.grpc.Team request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.Team> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTeam(com.behindthegoal.grpc.Team request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.Team> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTeam(com.behindthegoal.grpc.LeagueRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTeamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMatchesByLeague(com.behindthegoal.grpc.LeagueRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMatchesByLeagueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMatchesByLeaguePaginated(com.behindthegoal.grpc.PaginatedLeagueRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.PaginatedMatchListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMatchesByLeaguePaginatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMatchStats(com.behindthegoal.grpc.MatchStatsRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMatchStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMatchStats(com.behindthegoal.grpc.MatchStats request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchStats> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMatchStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMatchStats(com.behindthegoal.grpc.MatchStats request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchStats> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMatchStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeamStats(com.behindthegoal.grpc.TeamStatsRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.TeamStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTeamStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTeamStats(com.behindthegoal.grpc.TeamStats request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.TeamStats> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTeamStatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FootballService.
   */
  public static final class FootballServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FootballServiceBlockingStub> {
    private FootballServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FootballServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FootballServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.behindthegoal.grpc.LeagueListResponse listLeagues(com.behindthegoal.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLeaguesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.behindthegoal.grpc.TeamListResponse listTeams(com.behindthegoal.grpc.LeagueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTeamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.behindthegoal.grpc.Team createTeam(com.behindthegoal.grpc.Team request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.behindthegoal.grpc.Team updateTeam(com.behindthegoal.grpc.Team request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.behindthegoal.grpc.Empty deleteTeam(com.behindthegoal.grpc.LeagueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTeamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.behindthegoal.grpc.MatchListResponse getMatchesByLeague(com.behindthegoal.grpc.LeagueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMatchesByLeagueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.behindthegoal.grpc.PaginatedMatchListResponse getMatchesByLeaguePaginated(com.behindthegoal.grpc.PaginatedLeagueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMatchesByLeaguePaginatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.behindthegoal.grpc.MatchStatsResponse getMatchStats(com.behindthegoal.grpc.MatchStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMatchStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.behindthegoal.grpc.MatchStats createMatchStats(com.behindthegoal.grpc.MatchStats request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMatchStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.behindthegoal.grpc.MatchStats updateMatchStats(com.behindthegoal.grpc.MatchStats request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMatchStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.behindthegoal.grpc.TeamStatsResponse getTeamStats(com.behindthegoal.grpc.TeamStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeamStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.behindthegoal.grpc.TeamStats updateTeamStats(com.behindthegoal.grpc.TeamStats request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTeamStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FootballService.
   */
  public static final class FootballServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FootballServiceFutureStub> {
    private FootballServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FootballServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FootballServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.LeagueListResponse> listLeagues(
        com.behindthegoal.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLeaguesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.TeamListResponse> listTeams(
        com.behindthegoal.grpc.LeagueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTeamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.Team> createTeam(
        com.behindthegoal.grpc.Team request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.Team> updateTeam(
        com.behindthegoal.grpc.Team request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.Empty> deleteTeam(
        com.behindthegoal.grpc.LeagueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTeamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.MatchListResponse> getMatchesByLeague(
        com.behindthegoal.grpc.LeagueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMatchesByLeagueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.PaginatedMatchListResponse> getMatchesByLeaguePaginated(
        com.behindthegoal.grpc.PaginatedLeagueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMatchesByLeaguePaginatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.MatchStatsResponse> getMatchStats(
        com.behindthegoal.grpc.MatchStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMatchStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.MatchStats> createMatchStats(
        com.behindthegoal.grpc.MatchStats request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMatchStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.MatchStats> updateMatchStats(
        com.behindthegoal.grpc.MatchStats request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMatchStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.TeamStatsResponse> getTeamStats(
        com.behindthegoal.grpc.TeamStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTeamStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.TeamStats> updateTeamStats(
        com.behindthegoal.grpc.TeamStats request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTeamStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_LEAGUES = 0;
  private static final int METHODID_LIST_TEAMS = 1;
  private static final int METHODID_CREATE_TEAM = 2;
  private static final int METHODID_UPDATE_TEAM = 3;
  private static final int METHODID_DELETE_TEAM = 4;
  private static final int METHODID_GET_MATCHES_BY_LEAGUE = 5;
  private static final int METHODID_GET_MATCHES_BY_LEAGUE_PAGINATED = 6;
  private static final int METHODID_GET_MATCH_STATS = 7;
  private static final int METHODID_CREATE_MATCH_STATS = 8;
  private static final int METHODID_UPDATE_MATCH_STATS = 9;
  private static final int METHODID_GET_TEAM_STATS = 10;
  private static final int METHODID_UPDATE_TEAM_STATS = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_LEAGUES:
          serviceImpl.listLeagues((com.behindthegoal.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.LeagueListResponse>) responseObserver);
          break;
        case METHODID_LIST_TEAMS:
          serviceImpl.listTeams((com.behindthegoal.grpc.LeagueRequest) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.TeamListResponse>) responseObserver);
          break;
        case METHODID_CREATE_TEAM:
          serviceImpl.createTeam((com.behindthegoal.grpc.Team) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.Team>) responseObserver);
          break;
        case METHODID_UPDATE_TEAM:
          serviceImpl.updateTeam((com.behindthegoal.grpc.Team) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.Team>) responseObserver);
          break;
        case METHODID_DELETE_TEAM:
          serviceImpl.deleteTeam((com.behindthegoal.grpc.LeagueRequest) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.Empty>) responseObserver);
          break;
        case METHODID_GET_MATCHES_BY_LEAGUE:
          serviceImpl.getMatchesByLeague((com.behindthegoal.grpc.LeagueRequest) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchListResponse>) responseObserver);
          break;
        case METHODID_GET_MATCHES_BY_LEAGUE_PAGINATED:
          serviceImpl.getMatchesByLeaguePaginated((com.behindthegoal.grpc.PaginatedLeagueRequest) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.PaginatedMatchListResponse>) responseObserver);
          break;
        case METHODID_GET_MATCH_STATS:
          serviceImpl.getMatchStats((com.behindthegoal.grpc.MatchStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchStatsResponse>) responseObserver);
          break;
        case METHODID_CREATE_MATCH_STATS:
          serviceImpl.createMatchStats((com.behindthegoal.grpc.MatchStats) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchStats>) responseObserver);
          break;
        case METHODID_UPDATE_MATCH_STATS:
          serviceImpl.updateMatchStats((com.behindthegoal.grpc.MatchStats) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchStats>) responseObserver);
          break;
        case METHODID_GET_TEAM_STATS:
          serviceImpl.getTeamStats((com.behindthegoal.grpc.TeamStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.TeamStatsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TEAM_STATS:
          serviceImpl.updateTeamStats((com.behindthegoal.grpc.TeamStats) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.TeamStats>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListLeaguesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.Empty,
              com.behindthegoal.grpc.LeagueListResponse>(
                service, METHODID_LIST_LEAGUES)))
        .addMethod(
          getListTeamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.LeagueRequest,
              com.behindthegoal.grpc.TeamListResponse>(
                service, METHODID_LIST_TEAMS)))
        .addMethod(
          getCreateTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.Team,
              com.behindthegoal.grpc.Team>(
                service, METHODID_CREATE_TEAM)))
        .addMethod(
          getUpdateTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.Team,
              com.behindthegoal.grpc.Team>(
                service, METHODID_UPDATE_TEAM)))
        .addMethod(
          getDeleteTeamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.LeagueRequest,
              com.behindthegoal.grpc.Empty>(
                service, METHODID_DELETE_TEAM)))
        .addMethod(
          getGetMatchesByLeagueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.LeagueRequest,
              com.behindthegoal.grpc.MatchListResponse>(
                service, METHODID_GET_MATCHES_BY_LEAGUE)))
        .addMethod(
          getGetMatchesByLeaguePaginatedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.PaginatedLeagueRequest,
              com.behindthegoal.grpc.PaginatedMatchListResponse>(
                service, METHODID_GET_MATCHES_BY_LEAGUE_PAGINATED)))
        .addMethod(
          getGetMatchStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.MatchStatsRequest,
              com.behindthegoal.grpc.MatchStatsResponse>(
                service, METHODID_GET_MATCH_STATS)))
        .addMethod(
          getCreateMatchStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.MatchStats,
              com.behindthegoal.grpc.MatchStats>(
                service, METHODID_CREATE_MATCH_STATS)))
        .addMethod(
          getUpdateMatchStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.MatchStats,
              com.behindthegoal.grpc.MatchStats>(
                service, METHODID_UPDATE_MATCH_STATS)))
        .addMethod(
          getGetTeamStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.TeamStatsRequest,
              com.behindthegoal.grpc.TeamStatsResponse>(
                service, METHODID_GET_TEAM_STATS)))
        .addMethod(
          getUpdateTeamStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.TeamStats,
              com.behindthegoal.grpc.TeamStats>(
                service, METHODID_UPDATE_TEAM_STATS)))
        .build();
  }

  private static abstract class FootballServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FootballServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.behindthegoal.grpc.FootballServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FootballService");
    }
  }

  private static final class FootballServiceFileDescriptorSupplier
      extends FootballServiceBaseDescriptorSupplier {
    FootballServiceFileDescriptorSupplier() {}
  }

  private static final class FootballServiceMethodDescriptorSupplier
      extends FootballServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FootballServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FootballServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FootballServiceFileDescriptorSupplier())
              .addMethod(getListLeaguesMethod())
              .addMethod(getListTeamsMethod())
              .addMethod(getCreateTeamMethod())
              .addMethod(getUpdateTeamMethod())
              .addMethod(getDeleteTeamMethod())
              .addMethod(getGetMatchesByLeagueMethod())
              .addMethod(getGetMatchesByLeaguePaginatedMethod())
              .addMethod(getGetMatchStatsMethod())
              .addMethod(getCreateMatchStatsMethod())
              .addMethod(getUpdateMatchStatsMethod())
              .addMethod(getGetTeamStatsMethod())
              .addMethod(getUpdateTeamStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
