package student_ivan_sihovtsov.lesson2.homework;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, I will subtract your arithmetic mean.");


        System.out.println("Please enter the first integer:");
        float first = scanner.nextInt();

        System.out.println("Please enter a second integer:");
        float second = scanner.nextInt();

        System.out.println("Please enter the third integer:");
        float third = scanner.nextInt();

        System.out.print("The arithmetic mean is: ");
        System.out.println((first + second + third) / 3);


        System.out.println(" ");
        System.out.println("Have a nice day! ");






    }

}
