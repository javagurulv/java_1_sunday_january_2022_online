package student_yevgeniy_tolks.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculator = new CalculatorTest();
        calculator.sumTest();
        calculator.subTest();
        calculator.mulTest();
        calculator.divTest();
        System.out.println();
        calculator.evenTestResult();
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
        }
        else {
            System.out.println("Div result - FAILED");
        }
    }

        public void evenTestResult(){

        int firstNumber=100;
        int secondNumber=3;

        Calculator calculator = new Calculator();
            boolean sumResultEvenTest = calculator.isEven(calculator.sumOfTwoNumbers(firstNumber,secondNumber));
            boolean subResultEvenTest = calculator.isEven(calculator.subOfTwoNumbers(firstNumber,secondNumber));
            boolean mulResultEvenTest = calculator.isEven(calculator.mulOfTwoNumbers(firstNumber,secondNumber));
            boolean divResultEvenTest = calculator.isEven(calculator.divOfTwoNumbers(firstNumber,secondNumber));
            System.out.println("Sum result is EVEN number - " + sumResultEvenTest);
            System.out.println("Subtraction result is EVEN number - " + subResultEvenTest);
            System.out.println("Multiplication result is EVEN number - " + mulResultEvenTest);
            System.out.println("Division result is EVEN number - " + divResultEvenTest);

        }
    }




