package student_deniss_dubko.deniss_dubko_lesson_5_homework.level_2_intern;

import java.util.Scanner;

class Task11ArrayOfThreeNumbersFromUser {

    public static void main(String[] args) {
        int[] marks = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integer numbers: ");
        marks[0] = scanner.nextInt();
        marks[1] = scanner.nextInt();
        marks[2] = scanner.nextInt();
        System.out.println("Mark 1: " + marks[0]);
        System.out.println("Mark 2: " + marks[1]);
        System.out.println("Mark 3: " + marks[2]);
    }


}
