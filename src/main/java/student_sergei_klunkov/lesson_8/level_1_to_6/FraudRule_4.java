package student_sergei_klunkov.lesson_8.level_1_to_6;

class FraudRule_4 extends FraudRule {

    public FraudRule_4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }
}
