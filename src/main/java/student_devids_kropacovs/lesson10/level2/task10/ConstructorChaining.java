package student_devids_kropacovs.lesson10.level2.task10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining (String constructorName, int constructorID){
        new ConstructorChaining(constructorName);
    }
    // допишите решение тут

}
