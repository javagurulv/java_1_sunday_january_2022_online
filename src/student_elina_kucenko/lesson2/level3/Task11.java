package student_elina_kucenko.lesson2.level3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 1st number");
        int number1 = scanner.nextInt();
        System.out.println("Please, enter 2nd number");
        int number2 = scanner.nextInt();
        System.out.println("Please, enter 3rd number");
        int number3 = scanner.nextInt();

        double sum = (number1+number2+number3)/(double)3;
        System.out.println("Average of 3 numbers is " + sum);

    }
}
