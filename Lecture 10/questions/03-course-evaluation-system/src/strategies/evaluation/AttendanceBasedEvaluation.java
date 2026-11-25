package strategies.evaluation;

import java.util.List;

import models.*;

public class AttendanceBasedEvaluation implements EvaluationStrategy {

    @Override
    public EvaluationResult evaluate(StudentPerformance studentPerformance) {
        double score = studentPerformance.attendancePercentage;
        List<InputValue> inputValues = List.of(
                new InputValue(InputType.ATTENDANCE_PERCENTAGE, studentPerformance.attendancePercentage));

        return new EvaluationResult(score, inputValues);
    }
}
