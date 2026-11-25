package factoryMethodExamples.testSubstitution;

import java.util.List;

// A plain Java "test", so no JUnit is needed.
public class OrderServiceTest {

    public static void main(String[] args) {

        TestableOrderService service = new TestableOrderService();

        service.placeOrder("asha@example.com", "ORD-1");

        List<String> expected = List.of("asha@example.com | Order ORD-1 confirmed");

        if (!service.fake().sent().equals(expected)) {
            throw new AssertionError("Unexpected emails: " + service.fake().sent());
        }

        System.out.println("PASS: confirmation email was requested, nothing was sent");
    }
}
