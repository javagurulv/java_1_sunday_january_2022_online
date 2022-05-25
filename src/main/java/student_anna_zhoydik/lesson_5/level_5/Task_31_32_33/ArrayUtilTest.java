package student_anna_zhoydik.lesson_5.level_5.Task_31_32_33;

public class ArrayUtilTest {

  public static void main(String[] args) {
    ArrayUtilTest test = new ArrayUtilTest();
    test.shouldCreateArray();

  }

  public void shouldCreateArray() {
    ArrayUtil arrayUtil = new ArrayUtil();
    int[] array = arrayUtil.createArray(1);
    if (array.length > 0) {
      System.out.println("Array created - Test OK!");
    } else {
      System.out.println("Array is not created - Test FAILED!");
    }
  }
  }



