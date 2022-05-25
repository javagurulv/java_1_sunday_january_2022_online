package student_vitaly_galuzo.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter length of array: ");

        int length = scr.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println("[" + i +"] = "+ array[i]);

        }












    }

}
