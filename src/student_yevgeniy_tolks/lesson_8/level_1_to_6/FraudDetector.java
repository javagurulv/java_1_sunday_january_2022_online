package student_yevgeniy_tolks.lesson_8.level_1_to_6;

import java.util.List;

class FraudDetector {

    private List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;

    }

    public boolean isFraud(Transaction transaction) {

        boolean isFraud = false;
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(transaction)) {
                isFraud = true;
                break;

            }
        }
        return isFraud;
    }
}