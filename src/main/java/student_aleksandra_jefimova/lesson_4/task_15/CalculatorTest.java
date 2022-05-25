package student_aleksandra_jefimova.lesson_4.task_15;

class CalculatorTest {
    public static void main(String[] args) {
    }

    public void maxOfThreeNumbersTest1() {
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(100, 2, 1);
        if (actualResult == 100) {
            System.out.println("maxOfThreeNumbersTest1 is OK");
        } else {
            System.out.println("maxOfThreeNumbersTest1 is FAIL");
        }
    }

    public void maxOfThreeNumbersTest2() {
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(1, 3, 2);
        if (actualResult == 3) {
            System.out.println("maxOfThreeNumbersTest2 is OK");
        } else {
            System.out.println("maxOfThreeNumbersTest2 is FAIL");
        }
    }

    public void maxOfThreeNumbersTest3() {
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(1, 3, 50);
        if (actualResult == 50) {
            System.out.println("maxOfThreeNumbersTest3 is OK");
        } else {
            System.out.println("maxOfThreeNumbersTest3 is FAIL");
        }
    }
    public void maxOfThreeNumbersTest4 () {
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(100, 100, 50);
        if (actualResult == 100) {
            System.out.println("maxOfThreeNumbersTest4 is OK");
        } else {
            System.out.println("maxOfThreeNumbersTest4 is FAIL");
        }
    }
    public void maxOfThreeNumbersTest5 () {
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(100, 50, 100);
        if (actualResult == 100) {
            System.out.println("maxOfThreeNumbersTest5 is OK");
        } else {
            System.out.println("maxOfThreeNumbersTest5 is FAIL");
        }
    }
    public void maxOfThreeNumbersTest6 () {
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(50, 100, 100);
        if (actualResult == 100) {
            System.out.println("maxOfThreeNumbersTest6 is OK");
        } else {
            System.out.println("maxOfThreeNumbersTest6 is FAIL");
        }
    }
    public void maxOfThreeNumbersTest7 () {
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(100, 100, 100);
        if (actualResult == 100) {
            System.out.println("maxOfThreeNumbersTest7 is OK");
        } else {
            System.out.println("maxOfThreeNumbersTest7 is FAIL");
        }
    }
}