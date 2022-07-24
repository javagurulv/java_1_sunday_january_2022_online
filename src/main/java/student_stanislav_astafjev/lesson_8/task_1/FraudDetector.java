package student_stanislav_astafjev.lesson_8.task_1;

import java.util.List;

class FraudDetector {

    private List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRulers) {
        this.fraudRules = fraudRulers;
    }

    public FraudDetectionResult isFraud(Transaction transaction) {
        String ruleName = null;
        boolean isFraud = false;
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(transaction)) {
                ruleName = rule.getRuleName();
                System.out.println();
                System.out.println(ruleName + " - " + transaction.toString());
                isFraud = true;
            }

        }
        return new FraudDetectionResult(isFraud,ruleName);
    }

}
