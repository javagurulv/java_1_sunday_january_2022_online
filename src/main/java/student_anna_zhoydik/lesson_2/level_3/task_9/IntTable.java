package student_anna_zhoydik.lesson_2.level_3.task_9;

import java.util.Scanner;

public class IntTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int a = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
      int b = i;
      System.out.println(a + "x" + b + "=" + a * b);
    }

  }
}
