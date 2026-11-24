import strategies.ReportDisplayStrategy;

public class Report {
    private String employeeName;
    private int tasksCompleted;
    private int tasksPending;
    private ReportDisplayStrategy displayStrategy;

    public Report(String employeeName, int tasksCompleted, int tasksPending) {
        this.employeeName = employeeName;
        this.tasksCompleted = tasksCompleted;
        this.tasksPending = tasksPending;
    }

    public void setDisplayStrategy(ReportDisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getTasksCompleted() {
        return tasksCompleted;
    }

    public int getTasksPending() {
        return tasksPending;
    }

    public void displayReport() {
        if (displayStrategy != null) {
            displayStrategy.displayReport(employeeName, tasksCompleted, tasksPending);
        }
    }
}
