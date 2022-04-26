package student_yevgeniy_tolks.lesson_9.level_7.task32;

class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();
        test.calculateDivisionTest();
        test.calculateAdditionTest();
        test.calculateSubtractionTest();
        test.calculateMultiplicationTest();
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

    public void calculateAdditionTest() {
        Argument leftSideNumber = new Argument(25);
        Argument rightSideNumber = new Argument(5);
        double expectedAdditionResult = 30;

        MathOperation addition = new Addition(leftSideNumber, rightSideNumber);
        double resultOfAddition = addition.calculate();
        if (expectedAdditionResult == resultOfAddition) {
            System.out.println("Addition of two numbers - TEST OK ");
        } else {
            System.out.println("Addition of two number - TEST FAILED");
        }
    }

    public void calculateSubtractionTest() {
        Argument leftSideNumber = new Argument(25);
        Argument rightSideNumber = new Argument(5);
        double expectedSubtractionResult = 20;
        MathOperation subtraction = new Subtraction(leftSideNumber, rightSideNumber);
        double resultOfSubtraction = subtraction.calculate();
        if (expectedSubtractionResult == resultOfSubtraction) {
            System.out.println("Subtraction of two numbers - TEST OK ");
        } else {
            System.out.println("Subtraction of two number - TEST FAILED");
        }
    }

    public void calculateMultiplicationTest() {
        Argument leftSideNumber = new Argument(25);
        Argument rightSideNumber = new Argument(5);
        double expectedMultiplicationResult = 125;

        MathOperation multiplication = new Multiplication(leftSideNumber, rightSideNumber);
        double resultOfMultiplication = multiplication.calculate();
        if (expectedMultiplicationResult == resultOfMultiplication) {
            System.out.println("Multiplication of two numbers - TEST OK ");
        } else {
            System.out.println("Multiplication of two number - TEST FAILED");
        }
    }
}
