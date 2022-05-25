package student_anna_zhoydik.lesson_3.level_2.task_9;

import java.util.Scanner;

public class HelloUsername {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите ваше имя: ");
    String username = scanner.next();
    System.out.println("Привет " + username + "!");

  }
}
