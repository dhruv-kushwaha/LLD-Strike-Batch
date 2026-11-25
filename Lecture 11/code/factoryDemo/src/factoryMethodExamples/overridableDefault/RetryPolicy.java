package factoryMethodExamples.overridableDefault;

public interface RetryPolicy {

    int maxAttempts();

    long delayMillis(int failedAttempt);
}
