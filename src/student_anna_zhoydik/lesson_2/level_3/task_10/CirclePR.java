package student_anna_zhoydik.lesson_2.level_3.task_10;

import java.util.Scanner;

public class CirclePR {
  public static void main(String[] args) {
    System.out.print("Введите радиус круга: ");
    Scanner scanner = new Scanner(System.in);
    double r = scanner.nextDouble();
    double p = 3.14;
    System.out.println("Периметр: "+2*p*r);
    System.out.println("Площадь: "+p*r*r);
  }
}
