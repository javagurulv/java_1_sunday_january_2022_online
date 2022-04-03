package student_yevgeniy_tolks.lesson_7.level_5;

import java.util.Scanner;

public class PowerCalculatorDemo {
    public static void main(String[] args) {

        PowerCalculator power = new PowerCalculator();
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int number = scan.nextInt();
        System.out.println("Enter value of power : ");
        int powerNumber = scan.nextInt();

        System.out.println("Result = " + power.calculatePowerOfNumber(number,powerNumber));
    }
}
