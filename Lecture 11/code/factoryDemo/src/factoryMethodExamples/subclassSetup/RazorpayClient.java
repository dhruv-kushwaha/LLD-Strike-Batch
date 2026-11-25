package factoryMethodExamples.subclassSetup;

// Simulated client, not the real SDK.
public class RazorpayClient implements GatewayClient {

    private final String keyId;
    private final String keySecret;
    private final int timeoutMillis;

    public RazorpayClient(String keyId, String keySecret, int timeoutMillis) {
        this.keyId = keyId;
        this.keySecret = keySecret;
        this.timeoutMillis = timeoutMillis;
    }

    @Override
    public String charge(long amountInPaise) {
        return "Razorpay charged " + amountInPaise
                + " (key=" + keyId + ", timeout=" + timeoutMillis + "ms)";
    }
}
