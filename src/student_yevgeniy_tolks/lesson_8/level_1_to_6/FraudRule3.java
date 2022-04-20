package student_yevgeniy_tolks.lesson_8.level_1_to_6;

class FraudRule3 extends FraudRule{

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");

    }
}
