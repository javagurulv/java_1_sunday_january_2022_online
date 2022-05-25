package student_anna_zhoydik.lesson_5.level_4.Task_26;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoopTask {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of array: ");
    int[] numbers = new int[scanner.nextInt()];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * 100);
    }
    System.out.println(Arrays.toString(numbers));
  }
}
