package student_elina_kucenko.lesson5.task4;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of array");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number that will be in array");
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));

    }
}
