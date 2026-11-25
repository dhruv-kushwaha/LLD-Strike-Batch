package factoryMethodExamples.overridableDefault;

// Also uses the default retry policy.
public class ReportJob extends Job {

    @Override
    protected String name() {
        return "ReportJob";
    }

    @Override
    protected void execute() {
        // Succeeds immediately.
    }
}
