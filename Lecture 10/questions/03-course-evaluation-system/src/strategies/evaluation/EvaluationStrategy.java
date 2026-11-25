package strategies.evaluation;

import models.*;

public interface EvaluationStrategy {
    EvaluationResult evaluate(StudentPerformance studentPerformance);
}