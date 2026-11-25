import models.*;
import strategies.evaluation.*;
import strategies.reporting.*;

public class Main {
    public static void main(String[] args) {
        StudentPerformance studentPerformance = new StudentPerformance(8, 90.0, 85.0, 95.0);

        Course course = new Course(new QuizBasedEvaluation(), new StudentViewReport());
        EvaluationResult evaluationResult = course.evaluateStudentPerformance(studentPerformance);
        String report = course.generateReport(evaluationResult);
        System.out.println(report);

        course.setEvaluationStrategy(new AttendanceBasedEvaluation());
        evaluationResult = course.evaluateStudentPerformance(studentPerformance);
        report = course.generateReport(evaluationResult);
        System.out.println(report);

        course.setReportViewStrategy(new MentorViewReport());
        report = course.generateReport(evaluationResult);
        System.out.println(report);
    }
}
