package student_elina_kucenko.lesson8;

import java.util.List;

class FraudDetector {

    private List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    public FraudDetectionResult isFraud(Transaction t) {

        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(t)) {
                System.out.println("Fraud transaction " + t);
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }
}
