package factoryMethodExamples.testSubstitution;

// Pretends to be a client that talks to a real mail server.
public class SmtpEmailClient implements EmailClient {

    @Override
    public void send(String to, String message) {
        System.out.println("SMTP: sending to " + to + ": " + message);
    }
}
