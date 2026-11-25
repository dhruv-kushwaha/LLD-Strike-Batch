package models;

public class StudentPerformance {
    public final int correctAnswerCount;
    public final double attendancePercentage;
    public final double projectQuality;
    public final double onTimeSubmission;

    public StudentPerformance(int correctAnswerCount, double attendancePercentage, double projectQuality,
            double onTimeSubmission) {
        this.correctAnswerCount = requireNonNegative(correctAnswerCount, "Correct answer count");
        this.attendancePercentage = requirePercentage(attendancePercentage, "Attendance percentage");
        this.projectQuality = requirePercentage(projectQuality, "Project quality");
        this.onTimeSubmission = requirePercentage(onTimeSubmission, "On-time submission");
    }

    private static int requireNonNegative(int value, String label) {
        if (value < 0) {
            throw new IllegalArgumentException(label + " cannot be negative, but was " + value);
        }
        return value;
    }

    private static double requirePercentage(double value, String label) {
        // Written as a negated range check so that NaN is rejected too.
        if (!(value >= 0 && value <= 100)) {
            throw new IllegalArgumentException(label + " must be between 0 and 100, but was " + value);
        }
        return value;
    }
}
