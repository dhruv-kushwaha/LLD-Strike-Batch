package factoryMethodExamples.overridableDefault;

public class NoRetry implements RetryPolicy {

    @Override
    public int maxAttempts() {
        return 1;
    }

    @Override
    public long delayMillis(int failedAttempt) {
        return 0;
    }
}
