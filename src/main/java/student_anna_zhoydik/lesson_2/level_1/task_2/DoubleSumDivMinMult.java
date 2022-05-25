package student_anna_zhoydik.lesson_2.level_1.task_2;

import java.util.Scanner;

public class DoubleSumDivMinMult {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите первое вещественное число: ");
    double a = scanner.nextDouble();
    System.out.println("Введите второе вещественное число: ");
    double b = scanner.nextDouble();
    double sum = a + b;
    double min = a - b;
    double mult = a * b;
    double div = a / b;
    System.out.println("Сумма: " + sum);
    System.out.println("Разность: " + min);
    System.out.println("Умножение: " + mult);
    System.out.println("Деление: " + div);

  }
}
