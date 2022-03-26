package student_aleksandrs_padalko.lesson_5.level_2.task_2;

import java.util.Arrays;
import java.util.Scanner;



class ArrayLength1 { public static void main(String[] args) {
    int[] numbers = new int[3];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter 3 numbers");
    numbers[0] = scanner.nextInt();
    numbers[1] = scanner.nextInt();
    numbers[2] = scanner.nextInt();
    System.out.println("The value of each cell " + Arrays.toString(numbers));
}


}
