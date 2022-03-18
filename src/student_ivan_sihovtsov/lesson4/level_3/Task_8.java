package student_ivan_sihovtsov.lesson4.level_3;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            if (secondNumber == thirdNumber){
                System.out.println("All numbers are equal");
            }

        }else {
            System.out.println("All numbers are different");
        }




    }

}
