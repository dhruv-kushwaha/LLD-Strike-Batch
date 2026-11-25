package strategies.evaluation;

import java.util.List;

import models.*;

public class ProjectBasedEvaluation implements EvaluationStrategy {

    @Override
    public EvaluationResult evaluate(StudentPerformance studentPerformance) {
        double score = (0.6 * studentPerformance.projectQuality) + (0.4 * studentPerformance.onTimeSubmission);
        List<InputValue> inputValues = List.of(
                new InputValue(InputType.PROJECT_QUALITY, studentPerformance.projectQuality),
                new InputValue(InputType.ON_TIME_SUBMISSION, studentPerformance.onTimeSubmission));

        return new EvaluationResult(score, inputValues);
    }
}