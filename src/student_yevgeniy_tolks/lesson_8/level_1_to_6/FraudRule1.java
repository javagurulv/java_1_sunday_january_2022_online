package student_yevgeniy_tolks.lesson_8.level_1_to_6;

class FraudRule1 extends FraudRule {
        public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getFullName().equals("Pokemon");
    }
}
