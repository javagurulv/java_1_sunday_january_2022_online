package student_anna_zhoydik.lesson_5.level_2.Task_14;

public class Array5 {
  public static void main(String[] args) {
    int[] numbers = new int[3];
    numbers[0] = (int) (Math.random() * 100);
    numbers[1] = (int) (Math.random() * 100);
    numbers[2] = (int) (Math.random() * 100);
    int sum = numbers[0] + numbers[1] + numbers[2];
    int average = sum / numbers.length;
    System.out.println(average);
  }
}
