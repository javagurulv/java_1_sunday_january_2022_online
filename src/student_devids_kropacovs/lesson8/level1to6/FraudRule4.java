package student_devids_kropacovs.lesson8.level1to6;

class FraudRule4 extends FraudRule{

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCountry().equals("Jamaica");
    }
}
