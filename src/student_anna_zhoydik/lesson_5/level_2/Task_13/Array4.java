package student_anna_zhoydik.lesson_5.level_2.Task_13;

public class Array4 {
  public static void main(String[] args) {
    int[] numbers = new int[3];
    numbers[0] = (int) (Math.random() * 10);
    numbers[1] = (int) (Math.random() * 10);
    numbers[2] = (int) (Math.random() * 10);
    int sum = numbers[0] + numbers[1] + numbers[2];
    System.out.println(sum);

  }
}
