package student_sergei_klunkov.lesson_9.level_7.task_32;

class Multiplication extends TwoArgumentMathOperation {

    public Multiplication(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide()*calculateRightSide();
    }
}
