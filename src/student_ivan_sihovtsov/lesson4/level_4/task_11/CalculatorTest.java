package student_ivan_sihovtsov.lesson4.level_4.task_11;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.testOne();
        calculatorTest.testTwo();
        calculatorTest.testThree();
        calculatorTest.testFour();
    }

    public void testOne() {
        int firstNumber = 40;
        int secondNumber = 4;

        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);

        if (result == 44) {
            System.out.println("-Test passed-");
        }else {
            System.out.println("-Test failed-");
        }
    }

    public void testTwo() {
        int firstNumber = 40;
        int secondNumber = 4;

        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);

        if (result == 36) {
            System.out.println("-Test passed-");
        }else {
            System.out.println("-Test failed-");
        }
    }

    public void testThree() {
        int firstNumber = 40;
        int secondNumber = 4;

        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);

        if (result == 10) {
            System.out.println("-Test passed-");
        }else {
            System.out.println("-Test failed-");
        }
    }

    public void testFour() {
        int firstNumber = 40;
        int secondNumber = 4;

        Calculator calculator = new Calculator();
        int result = calculator.mult(firstNumber, secondNumber);

        if (result == 160) {
            System.out.println("-Test passed-");
        }else {
            System.out.println("-Test failed-");
        }
    }

}
