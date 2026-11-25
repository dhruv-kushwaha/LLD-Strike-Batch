package strategies.reporting;

import models.EvaluationResult;

public interface ReportViewStrategy {
    String renderReport(EvaluationResult evaluationResult);
}
