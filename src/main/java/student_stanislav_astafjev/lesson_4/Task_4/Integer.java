package student_stanislav_astafjev.lesson_4.Task_4;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if (number %2 == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is not even");
        }
    }
}
