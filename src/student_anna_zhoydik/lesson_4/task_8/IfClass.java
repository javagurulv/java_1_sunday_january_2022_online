package student_anna_zhoydik.lesson_4.task_8;

import java.util.Scanner;

public class IfClass {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int num = scanner.nextInt();
    System.out.println("Enter first number: ");
    int num2 = scanner.nextInt();
    System.out.println("Enter first number: ");
    int num3 = scanner.nextInt();

    if (num == num2 && num2 == num3) {
      System.out.println("Numbers are equal");
    } else if (num != num2 && num2 != num3) {
      System.out.println("Numbers are not equal");
    } else {
      System.out.println("Numbers are different");
    }
  }
}
