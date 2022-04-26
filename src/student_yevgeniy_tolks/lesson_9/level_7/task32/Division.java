package student_yevgeniy_tolks.lesson_9.level_7.task32;

class Division extends TwoArgumentMathOperation {

    public Division(MathOperation leftArgument,
                    MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide()/calculateRightSide();
    }
}
