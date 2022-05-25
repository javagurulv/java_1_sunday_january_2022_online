package student_anna_zhoydik.lesson_5.level_5.Task_31_32_33;

public class ArrayUtil {
  public int[] createArray(int arrayLength) {
    return new int[arrayLength];
  }

  public void fillArrayWithRandomNumbers(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 100);
    }
  }

  public void printArrayToConsole(int[] array) {
    for (int print : array) {
      System.out.print(print);
    }
  }

  public int findMaxNumber(int[] array) {
    int max = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  public int findMinNumber(int[] array) {
    int min = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }

}
