package strategies;

public class DetailedDisplay implements ReportDisplayStrategy {
    @Override
    public void displayReport(String employeeName, int tasksCompleted, int tasksPending) {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Tasks Completed: " + tasksCompleted);
        System.out.println("Tasks Pending: " + tasksPending);
    }
}
