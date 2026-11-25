package factoryMethodExamples.testSubstitution;

import java.util.ArrayList;
import java.util.List;

// Records messages instead of sending them.
public class FakeEmailClient implements EmailClient {

    private final List<String> sent = new ArrayList<>();

    @Override
    public void send(String to, String message) {
        sent.add(to + " | " + message);
    }

    public List<String> sent() {
        return sent;
    }
}
