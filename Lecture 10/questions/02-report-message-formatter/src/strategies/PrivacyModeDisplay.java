package strategies;

public class PrivacyModeDisplay implements ReportDisplayStrategy {

    @Override
    public void displayReport(String employeeName, int tasksCompleted, int tasksPending) {
        System.out.println("Employee: " + employeeName.charAt(0) + "****");
        System.out.println("Tasks Completed: " + tasksCompleted);
        System.out.println("Tasks Pending: " + tasksPending);
    }

}
