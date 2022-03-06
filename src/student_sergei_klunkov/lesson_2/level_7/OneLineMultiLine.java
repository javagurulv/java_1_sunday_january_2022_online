package student_sergei_klunkov.lesson_2.level_7;


import java.util.Scanner;

public class OneLineMultiLine {


        public static void main(String[] args) {
            // 1. get first number from user

            Scanner myInput = new Scanner( System.in );
            System.out.println("Enter first number:");
            int firstNumber = myInput.nextInt();

            // 2. get second number from user
            System.out.println("Enter second number:");
            int secondNumber = myInput.nextInt();

            // 3. first number + second number
            // 4. print result to console

            int result = firstNumber + secondNumber;

            System.out.println("Result = " + result);
    }

}
