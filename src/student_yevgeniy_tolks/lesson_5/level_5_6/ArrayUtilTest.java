package student_yevgeniy_tolks.lesson_5.level_5_6;

class ArrayUtilTest {

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
