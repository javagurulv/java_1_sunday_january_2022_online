package student_sergei_klunkov.lesson_8.level_1;

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
