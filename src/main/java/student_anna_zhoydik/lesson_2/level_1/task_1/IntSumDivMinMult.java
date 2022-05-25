package student_anna_zhoydik.lesson_2.level_1.task_1;

import java.util.Scanner;

public class IntSumDivMinMult {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите первое число: ");
    int a = scanner.nextInt();
    System.out.print("Введите второе число: ");
    int b = scanner.nextInt();
    int sum = a + b;
    int min = a - b;
    int mult = a * b;
    int div = a / b;
    System.out.println("Сумма: " + sum);
    System.out.println("Разность: " + min);
    System.out.println("Умножение: " + mult);
    System.out.println("Деление: " + div);

  }
}
