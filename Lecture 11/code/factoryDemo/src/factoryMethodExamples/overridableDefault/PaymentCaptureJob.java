package factoryMethodExamples.overridableDefault;

// The unusual one: a blind retry could charge the customer twice.
public class PaymentCaptureJob extends Job {

    @Override
    protected RetryPolicy createRetryPolicy() {
        return new NoRetry();
    }

    @Override
    protected String name() {
        return "PaymentCaptureJob";
    }

    @Override
    protected void execute() {
        throw new IllegalStateException("Gateway timed out");
    }
}
