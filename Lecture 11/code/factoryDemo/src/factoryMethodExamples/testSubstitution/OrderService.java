package factoryMethodExamples.testSubstitution;

public class OrderService {

    public void placeOrder(String customerEmail, String orderId) {
        // ... save the order ...
        EmailClient client = createEmailClient();
        client.send(customerEmail, "Order " + orderId + " confirmed");
    }

    // Factory method: the seam a test can override.
    protected EmailClient createEmailClient() {
        return new SmtpEmailClient();
    }
}
