package student_stanislav_astafjev.lesson_8.task_1;

class FraudRule2 extends FraudRule {
    public FraudRule2(String ruleName) {
        super(ruleName);
    }
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 10000;
    }
}
