package student_yevgeniy_tolks.lesson_5.level_5_6;

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
            System.out.println("Array created - Test OK!");
        } else {
            System.out.println("Array is not created - Test FAILED!");
        }
    }

    public void shouldFindMaxNumber() {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 15;
        array[2] = 2;
        array[3] = 3;
        array[4] = 13;

        ArrayUtil arrayUtil = new ArrayUtil();
        int maxNumber = arrayUtil.findMaxNumber(array);
        if (maxNumber == array[1]) {
            System.out.println("Max number in array - Test OK!");
        } else {
            System.out.println("Test for max number FAILED!");
        }
    }

    public void shouldFindMinNumber() {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 15;
        array[2] = 1;
        array[3] = 3;
        array[4] = 13;

        ArrayUtil arrayUtil = new ArrayUtil();
        int minNumber = arrayUtil.findMinNumber(array);
        if (minNumber == array[2]) {
            System.out.println("Min number in array - Test OK!");
        } else {
            System.out.println("Test for min number FAILED!");
        }
    }
}
