package student_yevgeniy_tolks.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int sizeOfArray = scanner.nextInt();

        int[] numbers = new int[sizeOfArray];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
