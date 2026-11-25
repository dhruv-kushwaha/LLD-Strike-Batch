package factoryMethodExamples.subclassSetup;

public class StripeProcessor extends PaymentProcessor {

    private final String apiKey;

    public StripeProcessor(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    protected GatewayClient createClient() {
        return new StripeClient(apiKey, 2);
    }
}
