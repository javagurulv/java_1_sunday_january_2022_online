package student_sergei_klunkov.lesson_8.level_1;

class FraudFourthRule extends FraudRule {
    public FraudFourthRule(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }
}
