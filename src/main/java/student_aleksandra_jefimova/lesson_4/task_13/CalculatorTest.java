package student_aleksandra_jefimova.lesson_4.task_13;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest testRunner = new CalculatorTest();
        testRunner.testIsEven();
    }

    public void testIsEven() {
        Calculator subject = new Calculator();
//        boolean expectedResult = true;
        boolean actualResult = subject.isEven(9);
        if (actualResult) {
            System.out.println("Test has passed!");
        } else {
            System.out.println("Test failed");
            System.out.println("Expected: true but actual: " + actualResult);
        }
    }
}