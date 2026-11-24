package strategies;

public class CompactDisplay implements ReportDisplayStrategy {

    @Override
    public void displayReport(String employeeName, int tasksCompleted, int tasksPending) {
        System.out.println(employeeName + ": " + tasksCompleted + " completed, " + tasksPending + " pending");
    }
}
