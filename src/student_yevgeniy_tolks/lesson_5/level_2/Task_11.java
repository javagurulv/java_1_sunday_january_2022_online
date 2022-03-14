package student_yevgeniy_tolks.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {
        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("index 0: ");
        numbers[0] = scanner.nextInt();
        System.out.println("index 1: ");
        numbers[1] = scanner.nextInt();
        System.out.println("index 2: ");
        numbers[2] = scanner.nextInt();

        System.out.println(Arrays.toString(numbers));
    }
}
