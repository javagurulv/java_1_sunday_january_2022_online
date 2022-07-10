package student_deniss_dubko.deniss_dubko_lesson_10_homework.level_2_intern.task_10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName,
                               int parameterCount) {

        this(constructorName);
        this.parameterCount = parameterCount;
    }

}