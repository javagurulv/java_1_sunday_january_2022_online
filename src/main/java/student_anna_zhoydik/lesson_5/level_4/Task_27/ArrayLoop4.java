package student_anna_zhoydik.lesson_5.level_4.Task_27;

import java.util.Arrays;

public class ArrayLoop4 {
  public static void main(String[] args) {
    int[] numbers = new int[(int) (Math.random() * 10 + 1)];
    int number = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * 100);
      if (numbers[i] > number) {
        number = numbers[i];
      }
    }
    int maxNumber = Arrays.stream(numbers).max().getAsInt();
    System.out.println(maxNumber);
  }
}



