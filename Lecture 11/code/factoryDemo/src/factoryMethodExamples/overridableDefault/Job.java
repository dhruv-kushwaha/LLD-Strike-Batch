package factoryMethodExamples.overridableDefault;

public abstract class Job {

    public final boolean run() {
        RetryPolicy policy = createRetryPolicy();

        for (int attempt = 1; attempt <= policy.maxAttempts(); attempt++) {
            try {
                execute();
                System.out.println(name() + " succeeded on attempt " + attempt);
                return true;
            } catch (RuntimeException e) {
                System.out.println(name() + " failed on attempt " + attempt);

                if (attempt < policy.maxAttempts()) {
                    // Printed instead of sleeping, to keep the demo fast.
                    System.out.println("  would wait " + policy.delayMillis(attempt) + "ms");
                }
            }
        }

        return false;
    }

    // Factory method with a default. Override only when needed.
    protected RetryPolicy createRetryPolicy() {
        return new ExponentialBackoff();
    }

    protected abstract String name();

    protected abstract void execute();
}
