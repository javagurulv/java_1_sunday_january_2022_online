package student_elina_kucenko.lesson8;

class FraudRule5 extends FraudRule {


    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000) {
            return true;
        } else {
            return false;
        }
    }
}
