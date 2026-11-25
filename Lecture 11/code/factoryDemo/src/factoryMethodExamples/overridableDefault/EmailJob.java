package factoryMethodExamples.overridableDefault;

// Uses the default retry policy.
public class EmailJob extends Job {

    private int calls = 0;

    @Override
    protected String name() {
        return "EmailJob";
    }

    @Override
    protected void execute() {
        if (++calls < 3) {
            throw new IllegalStateException("Mail server unavailable");
        }
    }
}
