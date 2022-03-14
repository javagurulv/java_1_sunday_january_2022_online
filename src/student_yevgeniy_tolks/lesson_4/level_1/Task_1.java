package student_yevgeniy_tolks.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        double number = scanner.nextDouble();

        if (number >= 0) {
            System.out.println(number + " is a positive a number!");
        } else {
            System.out.println(number + " is a negative number!");
        }

    }

}
