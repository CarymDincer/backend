// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: FootballService.proto
// Protobuf Java Version: 4.27.4

package com.behindthegoal.grpc;

public final class FootballServiceProto {
  private FootballServiceProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 4,
      /* suffix= */ "",
      FootballServiceProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_League_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_League_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_LeagueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_LeagueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_LeagueListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_LeagueListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_Team_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_Team_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_TeamListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_TeamListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_Match_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_Match_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_MatchStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_MatchStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_MatchStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_MatchStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_MatchStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_MatchStatsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_TeamStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_TeamStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_TeamStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_TeamStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_TeamStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_TeamStatsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_grpc_MatchListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_api_grpc_MatchListResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025FootballService.proto\022\010api.grpc\"\007\n\005Emp" +
      "ty\"3\n\006League\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\017" +
      "\n\007country\030\003 \001(\t\"\"\n\rLeagueRequest\022\021\n\tleag" +
      "ue_id\030\001 \001(\003\"7\n\022LeagueListResponse\022!\n\007lea" +
      "gues\030\001 \003(\0132\020.api.grpc.League\"C\n\004Team\022\n\n\002" +
      "id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\016\n\006points\030\003 \001(\005\022\021" +
      "\n\tleague_id\030\004 \001(\003\"1\n\020TeamListResponse\022\035\n" +
      "\005teams\030\001 \003(\0132\016.api.grpc.Team\"\205\001\n\005Match\022\n" +
      "\n\002id\030\001 \001(\003\022\024\n\014home_team_id\030\002 \001(\003\022\024\n\014away" +
      "_team_id\030\003 \001(\003\022\027\n\017home_team_score\030\004 \001(\005\022" +
      "\027\n\017away_team_score\030\005 \001(\005\022\022\n\nmatch_date\030\006" +
      " \001(\t\"\274\001\n\nMatchStats\022\020\n\010match_id\030\001 \001(\003\022\017\n" +
      "\007team_id\030\002 \001(\003\022\r\n\005goals\030\003 \001(\005\022\024\n\014yellow_" +
      "cards\030\004 \001(\005\022\021\n\tred_cards\030\005 \001(\005\022\r\n\005shots\030" +
      "\006 \001(\005\022\027\n\017shots_on_target\030\007 \001(\005\022\022\n\nposses" +
      "sion\030\010 \001(\005\022\027\n\017fouls_committed\030\t \001(\005\"%\n\021M" +
      "atchStatsRequest\022\020\n\010match_id\030\001 \001(\003\"?\n\022Ma" +
      "tchStatsResponse\022)\n\013match_stats\030\001 \003(\0132\024." +
      "api.grpc.MatchStats\"\313\001\n\tTeamStats\022\017\n\007tea" +
      "m_id\030\001 \001(\003\022\021\n\tleague_id\030\002 \001(\003\022\026\n\016matches" +
      "_played\030\003 \001(\005\022\014\n\004wins\030\004 \001(\005\022\r\n\005draws\030\005 \001" +
      "(\005\022\016\n\006losses\030\006 \001(\005\022\024\n\014goals_scored\030\007 \001(\005" +
      "\022\026\n\016goals_conceded\030\010 \001(\005\022\016\n\006points\030\t \001(\005" +
      "\022\027\n\017goal_difference\030\n \001(\005\"#\n\020TeamStatsRe" +
      "quest\022\017\n\007team_id\030\001 \001(\003\"<\n\021TeamStatsRespo" +
      "nse\022\'\n\nteam_stats\030\001 \001(\0132\023.api.grpc.TeamS" +
      "tats\"5\n\021MatchListResponse\022 \n\007matches\030\001 \003" +
      "(\0132\017.api.grpc.Match2\303\005\n\017FootballService\022" +
      "<\n\013ListLeagues\022\017.api.grpc.Empty\032\034.api.gr" +
      "pc.LeagueListResponse\022@\n\tListTeams\022\027.api" +
      ".grpc.LeagueRequest\032\032.api.grpc.TeamListR" +
      "esponse\022,\n\nCreateTeam\022\016.api.grpc.Team\032\016." +
      "api.grpc.Team\022,\n\nUpdateTeam\022\016.api.grpc.T" +
      "eam\032\016.api.grpc.Team\0226\n\nDeleteTeam\022\027.api." +
      "grpc.LeagueRequest\032\017.api.grpc.Empty\022J\n\022G" +
      "etMatchesByLeague\022\027.api.grpc.LeagueReque" +
      "st\032\033.api.grpc.MatchListResponse\022J\n\rGetMa" +
      "tchStats\022\033.api.grpc.MatchStatsRequest\032\034." +
      "api.grpc.MatchStatsResponse\022>\n\020CreateMat" +
      "chStats\022\024.api.grpc.MatchStats\032\024.api.grpc" +
      ".MatchStats\022>\n\020UpdateMatchStats\022\024.api.gr" +
      "pc.MatchStats\032\024.api.grpc.MatchStats\022G\n\014G" +
      "etTeamStats\022\032.api.grpc.TeamStatsRequest\032" +
      "\033.api.grpc.TeamStatsResponse\022;\n\017UpdateTe" +
      "amStats\022\023.api.grpc.TeamStats\032\023.api.grpc." +
      "TeamStatsB0\n\026com.behindthegoal.grpcB\024Foo" +
      "tballServiceProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_api_grpc_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_grpc_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_api_grpc_League_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_grpc_League_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_League_descriptor,
        new java.lang.String[] { "Id", "Name", "Country", });
    internal_static_api_grpc_LeagueRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_grpc_LeagueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_LeagueRequest_descriptor,
        new java.lang.String[] { "LeagueId", });
    internal_static_api_grpc_LeagueListResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_grpc_LeagueListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_LeagueListResponse_descriptor,
        new java.lang.String[] { "Leagues", });
    internal_static_api_grpc_Team_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_grpc_Team_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_Team_descriptor,
        new java.lang.String[] { "Id", "Name", "Points", "LeagueId", });
    internal_static_api_grpc_TeamListResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_grpc_TeamListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_TeamListResponse_descriptor,
        new java.lang.String[] { "Teams", });
    internal_static_api_grpc_Match_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_grpc_Match_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_Match_descriptor,
        new java.lang.String[] { "Id", "HomeTeamId", "AwayTeamId", "HomeTeamScore", "AwayTeamScore", "MatchDate", });
    internal_static_api_grpc_MatchStats_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_grpc_MatchStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_MatchStats_descriptor,
        new java.lang.String[] { "MatchId", "TeamId", "Goals", "YellowCards", "RedCards", "Shots", "ShotsOnTarget", "Possession", "FoulsCommitted", });
    internal_static_api_grpc_MatchStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_grpc_MatchStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_MatchStatsRequest_descriptor,
        new java.lang.String[] { "MatchId", });
    internal_static_api_grpc_MatchStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_grpc_MatchStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_MatchStatsResponse_descriptor,
        new java.lang.String[] { "MatchStats", });
    internal_static_api_grpc_TeamStats_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_grpc_TeamStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_TeamStats_descriptor,
        new java.lang.String[] { "TeamId", "LeagueId", "MatchesPlayed", "Wins", "Draws", "Losses", "GoalsScored", "GoalsConceded", "Points", "GoalDifference", });
    internal_static_api_grpc_TeamStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_grpc_TeamStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_TeamStatsRequest_descriptor,
        new java.lang.String[] { "TeamId", });
    internal_static_api_grpc_TeamStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_grpc_TeamStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_TeamStatsResponse_descriptor,
        new java.lang.String[] { "TeamStats", });
    internal_static_api_grpc_MatchListResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_grpc_MatchListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_api_grpc_MatchListResponse_descriptor,
        new java.lang.String[] { "Matches", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
