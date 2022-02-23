package student_anna_zhoydik.lesson_2.level_2.task_8;

import java.util.Scanner;

public class HelloName {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите ваше имя: ");
    String name = scanner.next();
    System.out.println("Hello" + " " + name + "!");
  }
}
