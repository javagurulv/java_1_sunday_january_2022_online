package student_devids_kropacovs.lesson8.level1;

class FraudRule5 extends FraudRule{

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCountry().equals("Germany") && t.getAmount() >= 1000;
    }
}
