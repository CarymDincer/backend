package api.grpc;

import org.springframework.stereotype.Component;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

@Component
public class GrpcServer {
	private Server server;

    public void start() throws IOException {
        server = ServerBuilder.forPort(8000)
                .addService(new FootballServiceGrpcImpl())
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
