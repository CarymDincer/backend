package api.grpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

@Component
public class GrpcServer {
	private Server server;
	
	@Autowired
	private FootballServiceGrpcImpl footballServiceGrpc;

    public void start() throws IOException {
        server = ServerBuilder.forPort(8080)
                .addService(footballServiceGrpc)
                .build()
                .start();

        System.out.println("GRPC Server running on port 8000...");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("GRPC Server shutting down...");
            GrpcServer.this.stop();
        }));
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

}
