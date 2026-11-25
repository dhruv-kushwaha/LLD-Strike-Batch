package factoryMethodExamples.subclassSetup;

public class RazorpayProcessor extends PaymentProcessor {

    private final String keyId;
    private final String keySecret;

    public RazorpayProcessor(String keyId, String keySecret) {
        this.keyId = keyId;
        this.keySecret = keySecret;
    }

    @Override
    protected GatewayClient createClient() {
        return new RazorpayClient(keyId, keySecret, 3000);
    }
}
