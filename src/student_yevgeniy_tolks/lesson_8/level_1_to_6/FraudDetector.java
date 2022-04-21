package student_yevgeniy_tolks.lesson_8.level_1_to_6;

import java.util.List;

class FraudDetector {

    private List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;

    }

    public FraudDetectionResult isFraud(Transaction transaction) {
        String ruleName = null;
        boolean isFraud = false;
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(transaction)) {
                ruleName = rule.getRuleName();
                isFraud = true;
                            }
        }
        return new FraudDetectionResult(isFraud, ruleName);
    }
}