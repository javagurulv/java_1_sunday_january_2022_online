package student_yevgeniy_tolks.lesson_8.level_1_to_6;

class FraudRule5 extends FraudRule{

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Germany") && transaction.getAmount() > 1000;
    }
}
