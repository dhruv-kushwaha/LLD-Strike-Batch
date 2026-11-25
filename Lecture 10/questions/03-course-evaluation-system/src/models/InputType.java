package models;

public enum InputType {
    CORRECT_ANSWER_COUNT("Correct Answer Count"),
    ATTENDANCE_PERCENTAGE("Attendance Percentage"),
    PROJECT_QUALITY("Project Quality"),
    ON_TIME_SUBMISSION("On-Time Submission");

    public final String displayName;

    InputType(String displayName) {
        this.displayName = displayName;
    }
}