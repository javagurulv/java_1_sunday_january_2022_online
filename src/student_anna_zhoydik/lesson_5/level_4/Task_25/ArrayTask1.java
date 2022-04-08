package student_anna_zhoydik.lesson_5.level_4.Task_25;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the array length: ");
    int[] numbers = new int[scanner.nextInt()];
    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Enter the number: ");
      numbers[i] = scanner.nextInt();
    }
    System.out.println(Arrays.toString(numbers));

  }
}
