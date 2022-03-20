package student_elina_kucenko.lesson4.level2;

import java.util.Scanner;

 class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number");
        int number2 = scanner.nextInt();
        if (number1 != number2) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equals");
        }
    }
}