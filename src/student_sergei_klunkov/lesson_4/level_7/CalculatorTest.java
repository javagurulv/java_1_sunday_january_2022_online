package student_sergei_klunkov.lesson_4.level_7;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        int expectedResult = 75;
        int actualResult = calculator.sum(firstNumber, secondNumber);
        check(expectedResult, actualResult, "sumTest");
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int expectedResult = 20;
        int actualResult = calculator.sub(firstNumber, secondNumber);
        check(expectedResult, actualResult, "subTest");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int expectedResult = 25;
        int actualResult = calculator.mul(firstNumber, secondNumber);
        check(expectedResult, actualResult, "mulTest");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int expectedResult = 5;
        int actualResult = calculator.div(firstNumber, secondNumber);
        check(expectedResult, actualResult, "divTest");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean expectedResult = true;
        boolean actualResult = calculator.isEven(40);
        check2(expectedResult, actualResult, "IsEvenTest1");
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean expectedResult = false;
        boolean actualResult = calculator.isEven(41);
        check2(expectedResult, actualResult, "IsEvenTest2");
    }

    public void check(int expectedResult, int actualResult, String name){
        if (expectedResult == actualResult) {
            System.out.println(name + " has passed! ");
        } else {
            System.out.println(name + " has failed! ");
        }


    }
    public void check2(boolean expectedResult, boolean actualResult, String name){
        if (expectedResult == actualResult) {
            System.out.println(name + " test has passed! ");
        } else {
            System.out.println(name + " test has failed! ");
        }
    }
}

