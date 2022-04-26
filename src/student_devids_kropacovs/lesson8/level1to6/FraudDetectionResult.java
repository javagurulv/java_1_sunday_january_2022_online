package student_devids_kropacovs.lesson8.level1to6;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName){
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public String getRuleName(){
        return ruleName;
    }

    public void setRuleName(String ruleName){
        this.ruleName = ruleName;
    }

    public boolean getFraudResult(){
        return fraud;
    }

    public void setFraudResult(boolean fraud){
        this.fraud = fraud;
    }
    // реализуйте конструктор класса
    // реализуйте get() и set() методы для каждого свойства

}
