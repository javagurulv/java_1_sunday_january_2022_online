package student_sergei_klunkov.lesson_2.level_1;

import java.util.Scanner;

class Addition {

    public static void main(String[] args) {
        // 1. get first number from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter first number:");
        int firstNumber = myInput.nextInt();

        // 2. get second number from user
        System.out.println("Enter second number:");
        int secondNumber = myInput.nextInt();

        // 3. first number + second number
        int result = firstNumber + secondNumber;

        // 4. print result to console
        System.out.println("Result = " + result);

    }

}