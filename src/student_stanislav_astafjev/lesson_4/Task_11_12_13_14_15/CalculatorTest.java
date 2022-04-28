package student_stanislav_astafjev.lesson_4.Task_11_12_13_14_15;

import java.util.concurrent.Callable;

class CalculatorTest {
    public static void main(String[] args) {
        sumTest();
        subTest();
        divisionTest();
        multiplicationTest();
        evenTest();
        maxOfTwoNumbersTestOne();
        maxOfTwoNumbersTestTwo();
        maxOfTwoNumbersTestThree();
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
    public static void divisionTest() {
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
    public static void multiplicationTest() {
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
        int maxOfTwoNumbers = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " greater then " + secondNumber);
        }
        else if (firstNumber < secondNumber) {
            System.out.println(secondNumber + " less than " + firstNumber);
        }
        else {
            System.out.println(secondNumber + " both numbers are equal " + firstNumber);
        }
    }
    public static void maxOfTwoNumbersTestTwo() {
        int firstNumber = 42;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int minOfTwoNumbers = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (firstNumber > secondNumber) {
            System.out.println(secondNumber + " less than " + firstNumber);
        }
        else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " greater then " + secondNumber);
        }
        else {
            System.out.println(firstNumber + " both numbers are equal " +secondNumber);
        }
    }
    public static void maxOfTwoNumbersTestThree() {
        int firstNumber = 15;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int twoNumbersEqual = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " greater then " + secondNumber);
        }
        else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " less than " + secondNumber);
        }
        else {
            System.out.println(firstNumber + " equal " + secondNumber);
        }
    }
}