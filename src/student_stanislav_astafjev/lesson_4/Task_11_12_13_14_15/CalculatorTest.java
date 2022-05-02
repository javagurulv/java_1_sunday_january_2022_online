package student_stanislav_astafjev.lesson_4.Task_11_12_13_14_15;

class CalculatorTest {
    public static void main(String[] args) {
        sumTest();
        subTest();
        divTest();
        mulTest();
        evenTest();
        maxOfTwoNumbersTestOne();
        maxOfTwoNumbersTestTwo();
        maxOfTwoNumbersTestThree();
        maxOfThreeNumbersTestOne();
        maxOfThreeNumbersTestTwo();
        maxOfThreeNumbersTestThree();
        maxOfThreeNumbersTestFour();
        maxOfThreeNumbersTestFive();
        maxOfThreeNumbersTestSix();
        maxOfThreeNumbersTestSeven();
        isEvenTest1();
        isEvenTest2();
    }


    public static void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public static void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    public static void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        }
        else {
            System.out.println("Division test = FAIL");
        }
    }
    public static void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.Multiplication(firstNumber,secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        }
        else {
            System.out.println("Multiplication test = FAIL");
        }
    }
    public static void evenTest() {
        int numberOne = 10;
        int numberTwo = 5;
        Calculator calculator = new Calculator();
        boolean sumTest = calculator.isEven(calculator.sum(numberOne,numberTwo));
            System.out.println("Sum result : " + sumTest);
        boolean subTest = calculator.isEven(calculator.sub(numberOne,numberTwo));
            System.out.println("Sub result : " + subTest);
        boolean divisionTest = calculator.isEven(calculator.division(numberOne,numberTwo));
            System.out.println("Division result : " + divisionTest);
        boolean multiplicationTest = calculator.isEven(calculator.Multiplication(numberOne,numberTwo));
            System.out.println("Multiplication result : " + multiplicationTest);
    }
    public static void maxOfTwoNumbersTestOne() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        System.out.println(firstNumber + " greater then " + secondNumber);
    }
    public static void maxOfTwoNumbersTestTwo() {
        int firstNumber = 42;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        System.out.println(secondNumber + " less than " + firstNumber);
    }
    public static void maxOfTwoNumbersTestThree() {
        int firstNumber = 15;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        System.out.println(firstNumber + " equal " + secondNumber);
    }
    public static void maxOfThreeNumbersTestOne() {
        int firstNumber = 55;
        int secondNumber = 33;
        int thirdNumber = 44;
        Calculator calculator = new Calculator();
        calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("the first number is greater than the second and third");
        }
    }
    public static void maxOfThreeNumbersTestTwo() {
        int firstNumber = 33;
        int secondNumber = 44;
        int thirdNumber = 23;
        Calculator calculator = new Calculator();
        calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (secondNumber > firstNumber && firstNumber > thirdNumber) {
            System.out.println("the second number is greater than the first and the third");
        }
    }
    public static void maxOfThreeNumbersTestThree() {
        int firstNumber = 33;
        int secondNumber = 44;
        int thirdNumber = 55;
        Calculator calculator = new Calculator();
        calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("the third number is greater than the first and second");
        }
    }
    public static void maxOfThreeNumbersTestFour() {
        int firstNumber = 44;
        int secondNumber = 44;
        int thirdNumber = 22;
        Calculator calculator = new Calculator();
        calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            System.out.println("the first two are equal and greater than the third");
        }
    }
    public static void maxOfThreeNumbersTestFive() {
        int firstNumber = 32;
        int secondNumber = 44;
        int thirdNumber = 44;
        Calculator calculator = new Calculator();
        calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            System.out.println("the second and third numbers are equal and greater than the first");
        }
    }
    public static void maxOfThreeNumbersTestSix() {
        int firstNumber = 44;
        int secondNumber = 34;
        int thirdNumber = 44;
        Calculator calculator = new Calculator();
        calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (thirdNumber == firstNumber && thirdNumber > secondNumber) {
            System.out.println("The third and first number are equal and greater than the second");
        }
    }
    public static void maxOfThreeNumbersTestSeven() {
        int firstNumber = 44;
        int secondNumber = 44;
        int thirdNumber = 44;
        Calculator calculator = new Calculator();
        calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers equal");
        }
    }
    public static void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(40);
        if(result) {
            System.out.println("isEven test = OK");
        }
        else {
            System.out.println("isEven test = FAIL");
        }
    }
    public static void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(41);
        if(result == false) {
            System.out.println("isEven Test = OK");
        }
        else {
            System.out.println("isEven Test = FAIL");
        }
    }
}