package student_elina_kucenko.lesson4.task3;

import java.util.Scanner;

 class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number");
        int number2 = scanner.nextInt();
        System.out.println("Please enter third number");
        int number3 = scanner.nextInt();

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
        }
        else if (number1 != number2 && number2 != number3)
        {System.out.println("All numbers are different");
        }
        else {System.out.println("Neither all are equal or different");
        }
    }
}