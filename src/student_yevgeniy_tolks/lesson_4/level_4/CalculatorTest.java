package student_yevgeniy_tolks.lesson_4.level_4;

//

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculator = new CalculatorTest();
        calculator.sumTest();
        calculator.subTest();
        calculator.mulTest();
        calculator.divTest();
        System.out.println();
        calculator.evenTestResult();
        System.out.println();
        calculator.testFirstMaxOfTwoNumbers();
        calculator.testSecondMaxOfTwoNumbers();
        calculator.testNumbersEqual();
        System.out.println();
        calculator.testFirstMax();
        calculator.testSecondMax();
        calculator.testThirdMax();
        System.out.println();
        calculator.testFirstSecondEqualAndMax();
        calculator.testFirstThirdEqualAndMax();
        calculator.testSecondThirdEqualAndMax();
        calculator.testFirstSecondThirdEqual();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int realResult = calculator.sumOfTwoNumbers(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Sum test is - OK!");
        } else {
            System.out.println("Sum test - FAILED!");
        }
    }

    public void subTest() {
        int firstNumber = 20;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int subResult = calculator.subOfTwoNumbers(firstNumber, secondNumber);
        if (subResult == expectedResult) {
            System.out.println("Sub test is - OK!");
        } else {
            System.out.println("Sub test - FAILED");
        }
    }

    public void mulTest() {

        int firstNumber = 15;
        int secondNumber = 2;
        int expectedResult = 30;

        Calculator calculator = new Calculator();
        int mulResult = calculator.mulOfTwoNumbers(firstNumber, secondNumber);
        if (mulResult == expectedResult) {
            System.out.println("Multiplication test is - OK");
        } else {
            System.out.println("Multiplication test - FAILED");
        }
    }

    public void divTest() {

        int firstNumber = 100;
        int secondNumber = 20;
        int expectedResult = 5;

        Calculator calculator = new Calculator();
        int divResult = calculator.divOfTwoNumbers(firstNumber, secondNumber);
        if (divResult == expectedResult) {
            System.out.println("Div test is - OK!");
        } else {
            System.out.println("Div result - FAILED");
        }
    }

    public void evenTestResult() {

        int firstNumber = 100;
        int secondNumber = 3;

        Calculator calculator = new Calculator();
        boolean sumResultEvenTest = calculator.isEven(calculator.sumOfTwoNumbers(firstNumber, secondNumber));
        boolean subResultEvenTest = calculator.isEven(calculator.subOfTwoNumbers(firstNumber, secondNumber));
        boolean mulResultEvenTest = calculator.isEven(calculator.mulOfTwoNumbers(firstNumber, secondNumber));
        boolean divResultEvenTest = calculator.isEven(calculator.divOfTwoNumbers(firstNumber, secondNumber));
        System.out.println("Sum result is EVEN number - " + sumResultEvenTest);
        System.out.println("Subtraction result is EVEN number - " + subResultEvenTest);
        System.out.println("Multiplication result is EVEN number - " + mulResultEvenTest);
        System.out.println("Division result is EVEN number - " + divResultEvenTest);

    }

    public void testFirstMaxOfTwoNumbers() {

        int firstNumber = 91;
        int secondNumber = 90;

        Calculator calculator = new Calculator();
        int maxNumber = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (maxNumber == firstNumber) {
            System.out.println("First number bigger than second - TEST OK!");
        } else {
            System.out.println("TEST FAILED");
        }

    }

    public void testSecondMaxOfTwoNumbers() {

        int firstNumber = 47;
        int secondNumber = 49;

        Calculator calculator = new Calculator();

        int maxNumber = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (maxNumber == secondNumber) {
            System.out.println("Second number bigger then first - TEST OK");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    public void testNumbersEqual() {
        int firstNumber = 41;
        int secondNumber = 41;

        Calculator calculator = new Calculator();

        int maxNumber = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (maxNumber == firstNumber) {
            System.out.println("Numbers are egual- TEST OK");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    public void testFirstMax() {
        int firstNumber = 104;
        int secondNumber = 101;
        int thirdNumber = 102;

        Calculator calculator = new Calculator();
        int maxFromThree = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (maxFromThree == firstNumber) {
            System.out.println("First number is bigger than two others - TEST OK");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    public void testSecondMax() {
        int firstNumber = 1000;
        int secondNumber = 1080;
        int thirdNumber = 1009;

        Calculator calculator = new Calculator();
        int maxFromThree = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (maxFromThree == secondNumber) {
            System.out.println("Second number is bigger than two others - TEST OK");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    public void testThirdMax() {
        int firstNumber = 1042;
        int secondNumber = 1011;
        int thirdNumber = 1050;

        Calculator calculator = new Calculator();
        int maxFromThree = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (maxFromThree == thirdNumber) {
            System.out.println("Third number is bigger than two others - TEST OK");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    public void testFirstSecondEqualAndMax() {
        int firstNumber = 1055;
        int secondNumber = 1055;
        int thirdNumber = 1054;

        Calculator calculator = new Calculator();
        int maxFromTwo = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (maxFromTwo == secondNumber) {
            System.out.println("first/second number are equal and bigger than third - TEST OK");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    public void testFirstThirdEqualAndMax() {
        int firstNumber = 105;
        int secondNumber = 104;
        int thirdNumber = 105;

        Calculator calculator = new Calculator();
        int maxFromTwo = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (maxFromTwo == firstNumber && maxFromTwo == thirdNumber && maxFromTwo > secondNumber) {
            System.out.println("first/third number are equal and bigger than second - TEST OK");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    public void testSecondThirdEqualAndMax() {
        int firstNumber = 104;
        int secondNumber = 105;
        int thirdNumber = 105;

        Calculator calculator = new Calculator();
        int maxFromTwo = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (maxFromTwo == secondNumber && maxFromTwo == thirdNumber && maxFromTwo > firstNumber) {
            System.out.println("second/third number are equal and bigger than first - TEST OK");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    public void testFirstSecondThirdEqual() {
        int firstNumber = 20;
        int secondNumber = 20;
        int thirdNumber = 20;

        Calculator calculator = new Calculator();
        int allEqual = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (allEqual == secondNumber && allEqual == thirdNumber) {
            System.out.println("All three numbers are equal - TEST OK");
        } else {
            System.out.println("TEST FAILED");
        }
    }

}




