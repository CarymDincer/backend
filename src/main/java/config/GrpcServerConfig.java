package config;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import api.grpc.FootballServiceGrpcImpl;

import java.io.IOException;
@Configuration
public class GrpcServerConfig {
	
	@Bean
    public Server grpcServer(
            FootballServiceGrpcImpl footballService,
            GrpcExceptionInterceptor exceptionInterceptor) throws IOException {

        return ServerBuilder.forPort(8080)
                .addService(footballService)
                .intercept(exceptionInterceptor) 
                .build()
                .start();
    }

}
