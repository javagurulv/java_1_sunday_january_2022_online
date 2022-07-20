package student_stanislav_astafjev.lesson_8.task_1;

class FraudDetectionResult {
    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud,String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }
    public boolean isFraud() {
        return this.fraud;
    }
    public String getRuleName() {
        return this.ruleName;
    }
}
