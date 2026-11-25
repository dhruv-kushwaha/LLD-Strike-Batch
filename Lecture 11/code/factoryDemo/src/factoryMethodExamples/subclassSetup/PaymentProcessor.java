package factoryMethodExamples.subclassSetup;

public abstract class PaymentProcessor {

    public void process(long amountInPaise) {
        if (amountInPaise <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        GatewayClient client = createClient();
        System.out.println(client.charge(amountInPaise));
        System.out.println("Audit log: payment of " + amountInPaise + " processed");
    }

    // Factory method
    protected abstract GatewayClient createClient();
}
