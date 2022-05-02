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

    public int Multiplication(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {

        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }
    public int maxOfThreeNumbers(int firstNumber,int secondNumber,int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            return firstNumber;
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        }
        else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        }
        else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        }
        else if (firstNumber == thirdNumber && firstNumber > secondNumber) {
            return firstNumber;
        }
        else if (secondNumber == firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        }
        else if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            return secondNumber;
        }
        else {
            return thirdNumber;
        }
    }
}
