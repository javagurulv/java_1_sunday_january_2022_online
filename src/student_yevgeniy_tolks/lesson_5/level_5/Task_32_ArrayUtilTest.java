package student_yevgeniy_tolks.lesson_5.level_5;

class Task_32_ArrayUtilTest {

    public static void main(String[] args) {
        Task_32_ArrayUtilTest test = new Task_32_ArrayUtilTest();
        test.shouldCreateArray();

    }

    public void shouldCreateArray() {

        Task_31_ArrayUtil arrayUtil = new Task_31_ArrayUtil();
        int[] array = arrayUtil.createArray(1);
        if (array.length > 0) {
            System.out.println("Array created - Test OK!");
        } else {
            System.out.println("Array is not created - Test FAILED!");
        }

    }
}
