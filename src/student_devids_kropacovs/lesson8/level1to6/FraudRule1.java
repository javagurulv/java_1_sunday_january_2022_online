package student_devids_kropacovs.lesson8.level1to6;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getFullName().equals("Pokemon");
    }

}
