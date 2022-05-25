package student_anna_zhoydik.lesson_4.task_6;

import java.util.Scanner;

public class IfEx {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = scanner.nextInt();
    System.out.println("Enter second number:");
    int b = scanner.nextInt();
    if (a < b) {
      System.out.println(a + " is less than " + b);

    } else if (b < a) {
      System.out.println(b + " is less than " + a);
    }

  }
}
