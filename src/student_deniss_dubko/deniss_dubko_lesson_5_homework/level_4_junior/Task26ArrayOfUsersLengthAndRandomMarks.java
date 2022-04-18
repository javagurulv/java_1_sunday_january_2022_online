package student_deniss_dubko.deniss_dubko_lesson_5_homework.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class Task26ArrayOfUsersLengthAndRandomMarks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int lengthOfArray = scanner.nextInt();

        int[] marks = new int[lengthOfArray];
        for (int i = 0; i < marks.length; i++) {
            Random random = new Random();
            int mark = random.nextInt();
            marks[i] = mark;
            System.out.println(marks[i]);
        }
    }

}
