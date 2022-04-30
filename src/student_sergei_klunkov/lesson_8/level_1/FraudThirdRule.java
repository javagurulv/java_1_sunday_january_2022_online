package student_sergei_klunkov.lesson_8.level_1;

class FraudThirdRule extends FraudRule {
    public FraudThirdRule(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }
}
