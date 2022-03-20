package student_elina_kucenko.lesson5.level2;

import java.util.Arrays;
import java.util.Scanner;

class Task11 {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        System.out.println("Your numbers in array " + Arrays.toString(numbers));

    }
}
