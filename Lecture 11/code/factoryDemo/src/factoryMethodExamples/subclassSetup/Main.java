package factoryMethodExamples.subclassSetup;

public class Main {

    public static void main(String[] args) {

        PaymentProcessor processor = new RazorpayProcessor("demo-key-id", "demo-secret");
        processor.process(50_000);

        processor = new StripeProcessor("demo-api-key");
        processor.process(75_000);
    }
}
