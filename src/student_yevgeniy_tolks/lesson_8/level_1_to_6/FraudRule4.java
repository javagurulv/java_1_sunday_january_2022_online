package student_yevgeniy_tolks.lesson_8.level_1_to_6;

class FraudRule4 extends FraudRule{

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");

    }
}
