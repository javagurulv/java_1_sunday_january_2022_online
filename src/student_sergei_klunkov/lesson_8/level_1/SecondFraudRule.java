package student_sergei_klunkov.lesson_8.level_1;

class SecondFraudRule extends FraudRule {

    public SecondFraudRule(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() >= 100000;

    }
}
