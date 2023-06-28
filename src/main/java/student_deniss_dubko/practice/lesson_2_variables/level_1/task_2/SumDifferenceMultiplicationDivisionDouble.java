package student_deniss_dubko.practice.lesson_2_variables.level_1.task_2;

import java.util.Scanner;

class SumDifferenceMultiplicationDivisionDouble {

    public static void main(String[] args) {

        Scanner getTwoDoubleNumbersFromUser = new Scanner(System.in);

        System.out.println("Enter First Double Number: ");
        double firstNumber = getTwoDoubleNumbersFromUser.nextDouble();

        System.out.println("Enter Second Double Number: ");
        double secondNumber = getTwoDoubleNumbersFromUser.nextDouble();

        System.out.println("Sum of " + firstNumber + " and " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println("Difference of " + firstNumber + " and " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println("Multiplication of " + firstNumber + " and " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println("Division of " + firstNumber + " and " + secondNumber + " = " + (firstNumber / secondNumber));
    }

}