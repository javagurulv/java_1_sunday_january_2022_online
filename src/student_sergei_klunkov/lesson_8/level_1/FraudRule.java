package student_sergei_klunkov.lesson_8.level_1;

abstract class FraudRule {

    private String nameOfTheRule;
    public FraudRule(String nameOfTheRule) {
        this.nameOfTheRule = nameOfTheRule;
    }

    public String getNameOfTheRule() {
        return nameOfTheRule;
    }

    public abstract boolean isFraud(Transaction transaction);


}
