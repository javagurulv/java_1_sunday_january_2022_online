package student_ivan_sihovtsov.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            int randomMark = random.nextInt(100) ;
            array[i] = randomMark;
            System.out.println("Mark[" + i + "] = " + array[i]);
        }

    }

}
