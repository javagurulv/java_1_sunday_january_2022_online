package student_anna_zhoydik.lesson_5.level_2.Task_11;

import java.util.Scanner;

public class Array2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[3];
    System.out.print("Enter first number: ");
    numbers[1] = scanner.nextInt();
    System.out.print("Enter second number: ");
    numbers[0] = scanner.nextInt();
    System.out.print("Enter third number: ");
    numbers[2] = scanner.nextInt();
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);

  }
}
