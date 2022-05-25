package student_elina_kucenko.lesson8;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry().equals("Jamaica")) {
            return true;
        } else {
            return false;
        }
    }
}
