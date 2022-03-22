package student_aleksandra_jefimova.lesson_4.task_14;

class CalculatorTest {
    public static void main(String[] args) {
    }
    public void maxOfTwoNumbersTest1() {
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(100, 2);
        if (actualResult == 100) {
            System.out.println("maxOfTwoNumbersTest1 is OK");
        } else {
             System.out.println("maxOfTwoNumbersTest1 is FAIL");
        }
    }
    public void maxOfTwoNumbersTest2() {
        int expectedResult = 55;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(25, 55);
        if (actualResult == 55) {
            System.out.println("maxOfTwoNumbersTest2 is OK");
        } else {
            System.out.println("maxOfTwoNumbersTest2 is FAIL");
        }
    }
    public void maxOfTwoNumbersTest3() {
        int firstNumber = 10;
        int secNumber = 10;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(10, 10);
        if (actualResult == 10) {
            System.out.println("maxOfTwoNumbersTest3 is OK");
        } else {
            System.out.println("maxOfTwoNumbersTest3 is FAIL");
        }
    }
}
