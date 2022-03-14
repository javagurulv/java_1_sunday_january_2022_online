package student_elina_kucenko.lesson4.task2;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number");
        int number2 = scanner.nextInt();
        if (number1 < number2) {
            System.out.println(number1);
        } else if (number2 < number1) {
            System.out.println(number2);
        } else {
            System.out.println("your numbers are equal");
        }
    }
}