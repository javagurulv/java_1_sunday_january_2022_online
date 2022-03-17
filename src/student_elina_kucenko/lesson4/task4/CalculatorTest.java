package student_elina_kucenko.lesson4.task4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.minTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();

    }


    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void minTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.min(firstNumber, secondNumber);
        if (realResult == 5) {
            System.out.println("Min test = OK");
        } else {
            System.out.println("Min test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == 50) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == 2) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        if (calculator.isEven(10)) {
            System.out.println("IsEvent test = OK");
        } else {
            System.out.println("IsEvent test = FAIL");
        }
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        if (!calculator.isEven(7)) {
            System.out.println("IsEvent test = OK");
        } else {
            System.out.println("IsEvent test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest1() {
        int firstNumber = 5;
        int secondNumber = 7;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == secondNumber) {
            System.out.println("Max first number = OK");
        } else {
            System.out.println("Max first number = FAIL");
        }
    }

    private void maxOfTwoNumbersTest2() {
        int firstNumber = 7;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("Max Second number = OK");
        } else {
            System.out.println("Max second number = FAIL");
        }
    }

    private void maxOfTwoNumbersTest3() {
        int firstNumber = 7;
        int secondNumber = 7;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("Even numbers = OK");
        } else {
            System.out.println("Even numbers = FAIL");
        }
    }

    private void maxOfThreeNumbersTest1() {
        int firstNum = 3;
        int secondNum = 2;
        int thirdNum = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == firstNum) {
            System.out.println("first number is max - OK");
        } else {
            System.out.println("first number is not max - Fail");
        }
    }

    private void maxOfThreeNumbersTest2() {
        int firstNum = 3;
        int secondNum = 3;
        int thirdNum = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == firstNum) {
            System.out.println("first number is max (first and second are equal) - OK");
        } else {
            System.out.println("first number is not max - Fail");
        }
    }

    private void maxOfThreeNumbersTest3() {
        int firstNum = 1;
        int secondNum = 3;
        int thirdNum = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == secondNum) {
            System.out.println("second number is max - OK");
        } else {
            System.out.println("second number is not max - Fail");
        }
    }

    private void maxOfThreeNumbersTest4() {
        int firstNum = 2;
        int secondNum = 3;
        int thirdNum = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == secondNum) {
            System.out.println("second number is max (second and third are equal) - OK");
        } else {
            System.out.println("second number is not max - Fail");
        }
    }

    private void maxOfThreeNumbersTest5() {
        int firstNum = 1;
        int secondNum = 2;
        int thirdNum = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == thirdNum) {
            System.out.println("third number is max - OK");
        } else {
            System.out.println("third number is not max - Fail");
        }
    }

    private void maxOfThreeNumbersTest6() {
        int firstNum = 2;
        int secondNum = 2;
        int thirdNum = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == thirdNum) {
            System.out.println("third number is max (first and second are equal) - OK");
        } else {
            System.out.println("third number is not max - Fail");
        }
    }

    private void maxOfThreeNumbersTest7() {
        int firstNum = 3;
        int secondNum = 3;
        int thirdNum = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == thirdNum) {
            System.out.println("all numbers are equal - OK");
        } else {
            System.out.println("Fail");
        }
    }
}

