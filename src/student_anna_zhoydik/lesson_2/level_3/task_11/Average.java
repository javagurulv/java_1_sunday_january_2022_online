package student_anna_zhoydik.lesson_2.level_3.task_11;

import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int a = scanner.nextInt();
    System.out.print("Введите число: ");
    int b = scanner.nextInt();
    System.out.print("Введите число: ");
    int c = scanner.nextInt();
    int[] nums = {a, b, c};

    double result = 0;

    for (int i : nums) {

      result += i;

    }

    System.out.println("Значение среднего арифметического равно: " + result / nums.length);

  }


}

