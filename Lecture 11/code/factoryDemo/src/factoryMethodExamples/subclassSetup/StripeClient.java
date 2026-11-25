package factoryMethodExamples.subclassSetup;

// Simulated client, not the real SDK.
public class StripeClient implements GatewayClient {

    private final String apiKey;
    private final int maxRetries;

    public StripeClient(String apiKey, int maxRetries) {
        this.apiKey = apiKey;
        this.maxRetries = maxRetries;
    }

    @Override
    public String charge(long amountInPaise) {
        return "Stripe charged " + amountInPaise + " (maxRetries=" + maxRetries + ")";
    }
}
