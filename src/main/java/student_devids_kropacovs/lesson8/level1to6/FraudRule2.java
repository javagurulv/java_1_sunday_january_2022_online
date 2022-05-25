package student_devids_kropacovs.lesson8.level1to6;

class FraudRule2 extends FraudRule{

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getAmount() >= 1000000;
    }

}
