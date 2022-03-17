package student_alina_strumpe._lesson_4_if._level_7_Task_24;

class CalculatorTestAlina {

    public static void main(String[] args) {

        CalculatorAlina calculator = new CalculatorAlina();
        int sum = calculator.sum(10, 5);
        int sub = calculator.sub(10, 5);
        int mul = calculator.mul(10, 5);
        int div = calculator.div(10, 5);
        boolean isEven = calculator.isEven(4);


        CalculatorTestAlina calculatorTest = new CalculatorTestAlina();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();


    }

    public void sumTest() {
        CalculatorAlina calculator = new CalculatorAlina();
        int expectedResult = 8;
        int actualResult = calculator.sum(5, 3);
        check(actualResult, expectedResult, "sumTest");
    }

    public void subTest() {
        CalculatorAlina calculator = new CalculatorAlina();
        int expectedResult = 1;
        int actualResult = calculator.sub(5, 4);
        check(expectedResult, expectedResult, "subTest");
    }

    public void mulTest() {
        CalculatorAlina calculator = new CalculatorAlina();
        int expectedResult = 9;
        int actualResult = calculator.mul(3, 3);
        check(expectedResult, actualResult, "mulTest");
    }

    public void divTest() {
        CalculatorAlina calculator = new CalculatorAlina();
        int expectedResult = 2;
        int actualResult = calculator.div(8, 4);
        check(expectedResult, actualResult, "divTest");
    }

    public void isEvenTest1() {
        CalculatorAlina calculator = new CalculatorAlina();
        boolean result = calculator.isEven(8);
        check(result == true, "isEven Test 1");
    }

    //
    public void isEvenTest2() {
        CalculatorAlina calculator = new CalculatorAlina();
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


