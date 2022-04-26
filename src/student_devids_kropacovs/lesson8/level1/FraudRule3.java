package student_devids_kropacovs.lesson8.level1;

class FraudRule3 extends FraudRule{

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCity().equals("Sidney");
    }
}
