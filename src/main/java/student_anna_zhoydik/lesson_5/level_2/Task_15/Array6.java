package student_anna_zhoydik.lesson_5.level_2.Task_15;

public class Array6 {
  public static void main(String[] args) {
    int[] numbers = new int[3];
    numbers[0] = (int) (Math.random() * 10);
    numbers[1] = (int) (Math.random() * 10);
    numbers[2] = (int) (Math.random() * 10);
    System.out.println("Before:");
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    int number1 = numbers[0] + 2;
    int number2 = numbers[1] + 2;
    int number3 = numbers[2] + 2;
    System.out.println("After (+2):");
    System.out.println(number1);
    System.out.println(number2);
    System.out.println(number3);

  }
}
