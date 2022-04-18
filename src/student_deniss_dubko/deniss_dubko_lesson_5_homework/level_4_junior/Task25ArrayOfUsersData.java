package student_deniss_dubko.deniss_dubko_lesson_5_homework.level_4_junior;

import java.util.Arrays;
import java.util.Scanner;

class Task25ArrayOfUsersData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();

        int[] userMarks = new int[length];
        for (int i = 0; i < userMarks.length; i++) {
            System.out.println("Enter array numbers: ");
            userMarks[i] = scanner.nextInt();
            System.out.println(Arrays.toString(userMarks));
        }
    }

}
