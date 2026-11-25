package strategies.reporting;

public class MentorViewReport implements ReportViewStrategy {
    @Override
    public String renderReport(models.EvaluationResult evaluationResult) {
        // Implement the mentor view report rendering logic here
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Student has %s in the course with score : %.2f.",
                evaluationResult.isPassed() ? "passed" : "failed", evaluationResult.score));
        sb.append("The parameters used for calculating the results are: ");
        evaluationResult.inputValues.forEach(
                (param) -> sb
                        .append(param.name.toString())
                        .append(" = ")
                        .append(param.value)
                        .append(", "));
        return sb.toString();
    }
}
