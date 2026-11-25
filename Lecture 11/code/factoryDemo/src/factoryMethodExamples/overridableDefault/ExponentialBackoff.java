package factoryMethodExamples.overridableDefault;

public class ExponentialBackoff implements RetryPolicy {

    @Override
    public int maxAttempts() {
        return 3;
    }

    // 100, 200, 400, ...
    @Override
    public long delayMillis(int failedAttempt) {
        return 100L << (failedAttempt - 1);
    }
}
