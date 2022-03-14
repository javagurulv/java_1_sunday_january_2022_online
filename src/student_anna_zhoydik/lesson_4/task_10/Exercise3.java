package student_anna_zhoydik.lesson_4.task_10;

import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insert first number: ");
    int a = scanner.nextInt();
    System.out.println("Insert second number: ");
    int b = scanner.nextInt();
    System.out.println("Insert third number: ");
    int c = scanner.nextInt();

    if (a > b && a > c) {
      System.out.println(a);
    } else if (b > a && b > c) {
      System.out.println(b);
    } else {
      System.out.println(c);
    }

  }

}
