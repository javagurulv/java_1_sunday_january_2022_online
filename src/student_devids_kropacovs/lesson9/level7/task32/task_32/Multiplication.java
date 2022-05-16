package student_devids_kropacovs.lesson9.level7.task32.task_32;

class Multiplication extends TwoArgumentMathOperation{

    public Multiplication(MathOperation leftArgument,
                          MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate( ) {
        return calculateLeftSide() * calculateRightSide();
    }


}
