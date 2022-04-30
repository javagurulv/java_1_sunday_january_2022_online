package student_sergei_klunkov.lesson_8.level_1;

class FraudSecondRule extends FraudRule {

    public FraudSecondRule(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() >= 100000;

    }
}
