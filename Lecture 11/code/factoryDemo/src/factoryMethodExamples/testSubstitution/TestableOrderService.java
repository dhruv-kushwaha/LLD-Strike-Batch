package factoryMethodExamples.testSubstitution;

// Lives in test code in a real project.
public class TestableOrderService extends OrderService {

    private final FakeEmailClient fake = new FakeEmailClient();

    @Override
    protected EmailClient createEmailClient() {
        return fake;
    }

    public FakeEmailClient fake() {
        return fake;
    }
}
