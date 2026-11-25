package strategies.evaluation;

import java.util.List;

import models.*;

public class QuizBasedEvaluation implements EvaluationStrategy {

    @Override
    public EvaluationResult evaluate(StudentPerformance studentPerformance) {
        double score = Math.min(studentPerformance.correctAnswerCount * 10, 100);
        List<InputValue> inputValues = List.of(
                new InputValue(InputType.CORRECT_ANSWER_COUNT, studentPerformance.correctAnswerCount));

        return new EvaluationResult(score, inputValues);
    }
}
