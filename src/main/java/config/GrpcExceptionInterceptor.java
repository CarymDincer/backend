package config;
import io.grpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GrpcExceptionInterceptor implements ServerInterceptor{

    private static final Logger logger = LoggerFactory.getLogger(GrpcExceptionInterceptor.class);

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {

        return new ForwardingServerCallListener.SimpleForwardingServerCallListener<>(next.startCall(call, headers)) {
            @Override
            public void onHalfClose() {
                try {
                    super.onHalfClose();
                } catch (Exception e) {
                    logger.error("gRPC Exception Caught: ", e);
                    call.close(Status.INTERNAL.withDescription(e.getMessage()).withCause(e), new Metadata());
                }
            }
        };
    }
}
