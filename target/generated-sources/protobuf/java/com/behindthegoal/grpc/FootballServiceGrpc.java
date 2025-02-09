package com.behindthegoal.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
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
    default void getMatchStats(com.behindthegoal.grpc.MatchStatsRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMatchStatsMethod(), responseObserver);
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
    public void getMatchStats(com.behindthegoal.grpc.MatchStatsRequest request,
        io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMatchStatsMethod(), getCallOptions()), request, responseObserver);
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
    public com.behindthegoal.grpc.MatchStatsResponse getMatchStats(com.behindthegoal.grpc.MatchStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMatchStatsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.behindthegoal.grpc.MatchStatsResponse> getMatchStats(
        com.behindthegoal.grpc.MatchStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMatchStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_LEAGUES = 0;
  private static final int METHODID_LIST_TEAMS = 1;
  private static final int METHODID_GET_MATCH_STATS = 2;

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
        case METHODID_GET_MATCH_STATS:
          serviceImpl.getMatchStats((com.behindthegoal.grpc.MatchStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.behindthegoal.grpc.MatchStatsResponse>) responseObserver);
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
          getGetMatchStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.behindthegoal.grpc.MatchStatsRequest,
              com.behindthegoal.grpc.MatchStatsResponse>(
                service, METHODID_GET_MATCH_STATS)))
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
              .addMethod(getGetMatchStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
