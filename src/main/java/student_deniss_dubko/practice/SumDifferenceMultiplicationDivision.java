package student_deniss_dubko.practice;

import java.util.Scanner;

class SumDifferenceMultiplicationDivision {

    public static void main(String[] args) {

        Scanner getTwoNumbersFromUser = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = getTwoNumbersFromUser.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = getTwoNumbersFromUser.nextInt();

        System.out.println("Sum of " + firstNumber + " and " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println("Difference of " + firstNumber + " and " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println("Multiplication of " + firstNumber + " and " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println("Division of " + firstNumber + " and " + secondNumber + " = " + (firstNumber / secondNumber));
    }

}
