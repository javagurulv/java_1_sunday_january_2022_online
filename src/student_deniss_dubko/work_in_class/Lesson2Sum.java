package student_deniss_dubko.work_in_class;

import java.util.Scanner;

public class Lesson2Sum {

    public static void main(String[] args) {

        // Step 1 - zaprositj pervoe chislo
        // Step 2 - zaprositj vtoroe chislo
        // Step 3 - sum two numbers
        // Step 4 - vivesti na ekran rezuljtat


        Scanner scanner = new Scanner(System.in);

        // Step 1 - zaprositj pervoe chislo
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();

        // Step 2 - zaprositj vtoroe chislo
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        // Step 3 - sum two numbers
        int sum = firstNumber +  secondNumber;

        // Step 4 - vivesti na ekran rezuljtat
        System.out.println("Sum = " + sum);

    }

}
