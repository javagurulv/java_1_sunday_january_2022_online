package student_anna_zhoydik.lesson_4.task_5;

import java.util.Scanner;

public class ExersizeIf {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = scanner.nextInt();
    System.out.println("Enter second number:");
    int b = scanner.nextInt();
    if (a > b) {
      System.out.println(a + " is bigger than " + b);
    } else if (b > a) {
      System.out.println(b + " is bigger than " + b);

    }
  }
}
