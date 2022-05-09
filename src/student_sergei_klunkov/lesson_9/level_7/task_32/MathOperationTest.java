package student_sergei_klunkov.lesson_9.level_7.task_32;

class MathOperationTest {

    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();
        test.divisionTest();
        test.additionTest();
        test.subtractionTest();
        test.multiplicationTest();
    }

    public void divisionTest() {
        Argument leftSideNumber = new Argument(20);
        Argument rightSideNumber = new Argument(5);
        double expectedDivisionResult = 4;

        MathOperation division = new Division(leftSideNumber, rightSideNumber);
        double resultOfDivision = division.calculate();
        if (resultOfDivision == expectedDivisionResult) {
            System.out.println(" Division Test " + " - Test passed! ");
        } else {
            System.out.println(" Division Test " + " - Test failed! ");
        }
    }

    public void additionTest() {
        Argument leftSideNumber = new Argument(20);
        Argument rightSideNumber = new Argument(5);
        double expectedAdditionResult = 25;

        MathOperation addition = new Addition(leftSideNumber, rightSideNumber);
        double resultOfAddition = addition.calculate();
        if (resultOfAddition == expectedAdditionResult) {
            System.out.println(" Addition Test " + " - Test passed! ");
        } else {
            System.out.println(" Addition Test " + " - Test failed! ");
        }
    }

    public void subtractionTest() {
        Argument leftSideNumber = new Argument(20);
        Argument rightSideNumber = new Argument(5);
        double expectedSubtractionResult = 15;

        MathOperation subtraction = new Subtraction(leftSideNumber, rightSideNumber);
        double resultOfSubtraction = subtraction.calculate();
        if (resultOfSubtraction == expectedSubtractionResult) {
            System.out.println(" Subtraction Test " + " - Test passed! ");
        } else {
            System.out.println(" Subtraction Test " + " - Test failed! ");
        }
    }

    public void multiplicationTest() {
        Argument leftSideNumber = new Argument(20);
        Argument rightSideNumber = new Argument(5);
        double expectedMultiplicationResult = 100;

        MathOperation multiplication= new Multiplication(leftSideNumber, rightSideNumber);
        double resultOfMultiplication = multiplication.calculate();
        if (resultOfMultiplication == expectedMultiplicationResult) {
            System.out.println(" Multiplication Test " + " - Test passed! ");
        } else {
            System.out.println(" Multiplication Test " + " - Test failed! ");
        }
    }



}
