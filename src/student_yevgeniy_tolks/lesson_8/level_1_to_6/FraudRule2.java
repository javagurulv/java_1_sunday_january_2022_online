package student_yevgeniy_tolks.lesson_8.level_1_to_6;

class FraudRule2 extends FraudRule{

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 100000;
    }
}
