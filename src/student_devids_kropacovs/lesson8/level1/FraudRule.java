package student_devids_kropacovs.lesson8.level1;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName(){
        return  ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}