package student_yevgeniy_tolks.lesson_9.level_7.task32;

class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();
        test.calculateDivisionTest();
    }

    public void calculateDivisionTest() {
        Argument leftSideNumber = new Argument(25);
        Argument rightSideNumber = new Argument(5);
        double expectedDivisionResult = 5;

        MathOperation division = new Division(leftSideNumber, rightSideNumber);
        double resultOfDivision = division.calculate();

        if (expectedDivisionResult == resultOfDivision) {
            System.out.println("Division of two numbers - TEST OK ");
        } else {
            System.out.println("Division of two number - TEST FAILED");
        }

    }
}
