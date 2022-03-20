package student_elina_kucenko.lesson5.level4;

import java.util.Arrays;
import java.util.Scanner;

class Task26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of array");
        int arrayLength = scanner.nextInt();

        int[] randomNumbers = new int[arrayLength];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(randomNumbers));

    }
}
