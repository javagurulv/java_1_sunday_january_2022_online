package student_stanislav_astafjev.lesson_10.task_10;

class ConstructorChaining {
    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }
    public ConstructorChaining(String constructorName,int parameterCount) {
        this.constructorName = constructorName;
        this.parameterCount = parameterCount;
    }
}
