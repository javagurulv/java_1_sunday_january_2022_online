package student_yevgeniy_tolks.lesson_4.level_4;

import java.util.Scanner;

//Task 11 - Calculator
class Calculator {

    public int sumOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mulOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divOfTwoNumbers(int firstNumber, int secondNumber) {

        if (secondNumber == 0) {
            System.out.println("Warning, can not divide on O!!!");
        }
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
        }

    public int maxOfThreeNumbers(int firstNumber,int secondNumber,int thirdNumber){

        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            return firstNumber;
        }
        else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
          return secondNumber;
        }
        else if (firstNumber==secondNumber&&firstNumber>thirdNumber){
            return firstNumber;
        }
        else if (firstNumber==thirdNumber&&firstNumber>secondNumber) {
            return firstNumber;
        }
        else if (secondNumber==thirdNumber&&secondNumber>firstNumber){
            return secondNumber;
        }
        else if (firstNumber==secondNumber&&secondNumber==thirdNumber){
          return secondNumber;
        }
        else{
            return thirdNumber;
        }
    }
}
