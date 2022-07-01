package student_deniss_dubko.deniss_dubko_lesson_7_homework.level_5_middle;

import java.util.Scanner;

class PowerCalculatorDemo {

    public static void main(String[] args) {

        PowerCalculator powerCalculator = new PowerCalculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Enter power: ");
        int power = scanner.nextInt();
        System.out.println("Result: " + powerCalculator.raisingNumberToPower(number, power));
    }

}