package models;

import strategies.evaluation.EvaluationStrategy;
import strategies.reporting.ReportViewStrategy;

public class Course {
    private EvaluationStrategy evaluationStrategy;
    private ReportViewStrategy reportViewStrategy;

    public Course(EvaluationStrategy evaluationStrategy, ReportViewStrategy reportViewStrategy) {
        this.evaluationStrategy = evaluationStrategy;
        this.reportViewStrategy = reportViewStrategy;
    }

    public EvaluationStrategy getEvaluationStrategy() {
        return evaluationStrategy;
    }

    public void setEvaluationStrategy(EvaluationStrategy evaluationStrategy) {
        this.evaluationStrategy = evaluationStrategy;
    }

    public ReportViewStrategy getReportViewStrategy() {
        return reportViewStrategy;
    }

    public void setReportViewStrategy(ReportViewStrategy reportViewStrategy) {
        this.reportViewStrategy = reportViewStrategy;
    }

    public EvaluationResult evaluateStudentPerformance(StudentPerformance studentPerformance) {
        return evaluationStrategy.evaluate(studentPerformance);
    }

    public String generateReport(EvaluationResult evaluationResult) {
        return reportViewStrategy.renderReport(evaluationResult);
    }
}