package student_alina_strumpe._lesson_4_if._level_7_Task_24;

class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int sum = calculator.sum(10, 5);
        int sub = calculator.sub(10, 5);
        int mul = calculator.mul(10, 5);
        int div = calculator.div(10, 5);
        boolean isEven = calculator.isEven(4);


        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();


    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 8;
        int actualResult = calculator.sum(5, 3);
        check(actualResult, expectedResult, "sumTest");
    }

    public void subTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 1;
        int actualResult = calculator.sub(5, 4);
        check(expectedResult, expectedResult, "subTest");
    }

    public void mulTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 9;
        int actualResult = calculator.mul(3, 3);
        check(expectedResult, actualResult, "mulTest");
    }

    public void divTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 2;
        int actualResult = calculator.div(8, 4);
        check(expectedResult, actualResult, "divTest");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(8);
        check(result == true, "isEven Test 1");
    }

    //
    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(9);
        check(result == false, "isEven Test 2");
    }

    public void check(int expectedResult, int actualResult, String name) {
        if (expectedResult == actualResult) {
            System.out.println("Test " + name + "is OK");
        } else {
            System.out.println("Test " + name + "is FAIL");
            System.out.println("Expected result: " + expectedResult + " but actual result: " + actualResult);
        }

    }

    public void check(boolean result, String name) {
        if (result == true) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
            System.out.println("Expected result: " + true + " actual result: " + false);
        }
    }


}


