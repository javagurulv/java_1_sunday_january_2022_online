package student_stanislav_astafjev.lesson_8.task_1;

abstract class FraudRule {
    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;

    }
    public String getRuleName() {
        return ruleName;
    }
    public abstract boolean isFraud(Transaction transaction);
}
