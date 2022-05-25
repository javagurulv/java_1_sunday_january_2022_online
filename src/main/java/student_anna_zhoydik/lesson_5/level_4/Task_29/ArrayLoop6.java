package student_anna_zhoydik.lesson_5.level_4.Task_29;

public class ArrayLoop6 {
  public static void main(String[] args) {
    int[] numbers = new int[(int) (Math.random() * 10 + 1)];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * 100 + 1);
      if (numbers[i] % 2 == 0) {
        System.out.println(numbers[i]);
      }
    }
  }
}
