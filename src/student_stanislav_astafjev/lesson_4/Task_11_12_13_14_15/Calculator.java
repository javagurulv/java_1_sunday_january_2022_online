package student_stanislav_astafjev.lesson_4.Task_11_12_13_14_15;

import static java.lang.Math.max;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {

        return firstNumber / secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {

        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }
    public int maxOfThreeNumbers(int firstNumber,int secondNumber,int thirdNumber) {
        int maxNumber = Math.max(firstNumber,secondNumber);
        return Math.max(maxNumber,thirdNumber);
    }
}
