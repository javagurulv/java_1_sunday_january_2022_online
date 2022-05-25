package student_deniss_dubko.deniss_dubko_lesson_5_homework.level_5_6_middle.task_31_38;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(1);
        if (array.length > 0) {
            System.out.println("Test Create Array: OK");
        } else {
            System.out.println("Test Create Array: FAILED");
        }
    }

    public void shouldFindMaxNumber() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        ArrayUtil arrayUtil = new ArrayUtil();
        int maxArrayElement = arrayUtil.findMaxNumber(array);
        if (maxArrayElement == array[2]) {
            System.out.println("Test Find Max Number: OK");
        } else {
            System.out.println("Test Find Max Number: FAILED");
        }
    }

    public void shouldFindMinNumber() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        ArrayUtil arrayUtil = new ArrayUtil();
        int minArrayElement = arrayUtil.findMinNumber(array);
        if (minArrayElement == array[0]) {
            System.out.println("Test Find Min Number: OK");
        } else {
            System.out.println("Test Find Min Number: FAILED");
        }
    }

}
