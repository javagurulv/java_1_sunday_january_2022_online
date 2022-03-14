package student_elina_kucenko.lesson4.task3;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal.");
            //checking if number 1 is the biggest number
        } else if (number1 >= number2 && number1 >= number3) {
            System.out.println(number1 + " is the biggest number");
            //checking if number 2 is the biggest number
        } else if (number2 >= number1 && number2 > number3) {
            System.out.println(number2 + " is the biggest number");
        } else {
            System.out.println(number3 + " is the biggest number");
        }
    }
}
