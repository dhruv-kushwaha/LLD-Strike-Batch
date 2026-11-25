package models;

import java.util.List;

public class EvaluationResult {
    public double score;
    public List<InputValue> inputValues;

    public EvaluationResult(double score, List<InputValue> inputValues) {
        this.score = score;
        this.inputValues = inputValues;
    }

    public boolean isPassed() {
        return score >= 60;
    }
}