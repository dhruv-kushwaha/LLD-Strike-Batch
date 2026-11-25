package strategies.reporting;

import models.EvaluationResult;

public class StudentViewReport implements ReportViewStrategy {
    @Override
    public String renderReport(EvaluationResult evaluationResult) {
        // Implement the student view report rendering logic here
        return String.format("You have %s in the course with score : %.2f",
                evaluationResult.isPassed() ? "passed" : "failed", evaluationResult.score);
    }
}