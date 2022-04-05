package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_2_intern;

import java.util.Scanner;

class Task7EqualsOrDifferentNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integer numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals!");
        } else {
            System.out.println("Numbers are different!");
        }
    }


}
