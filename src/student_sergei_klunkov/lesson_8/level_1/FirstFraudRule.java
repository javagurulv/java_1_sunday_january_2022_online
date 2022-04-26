package student_sergei_klunkov.lesson_8.level_1;

class FirstFraudRule extends FraudRule {
    public FirstFraudRule(String nameOfTheRule) {
        super(nameOfTheRule);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getFullName().equals("Pokemon");
    }
}
