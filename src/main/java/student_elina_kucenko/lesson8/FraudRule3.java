package student_elina_kucenko.lesson8;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equals("Sydney")) {
            return true;
        } else {
            return false;
        }
    }
}
