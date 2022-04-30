package student_sergei_klunkov.lesson_8.level_1_to_6;

class FraudRule_2 extends FraudRule {

    public FraudRule_2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() >= 100000;

    }
}
