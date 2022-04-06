package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_2_intern;

import java.util.Scanner;

class Task6SmallestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integer numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Smallest number is: " + secondNumber);
            } else if (firstNumber == secondNumber) {
                System.out.println("Numbers are equal!");
            } else {
                System.out.println("Smallest number is: " + firstNumber);
        }
    }


}
