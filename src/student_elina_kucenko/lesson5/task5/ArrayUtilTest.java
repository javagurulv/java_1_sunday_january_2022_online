package student_elina_kucenko.lesson5.task5;

public class ArrayUtilTest {


    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);

        if (array.length == 5) {
            System.out.println("Array created - OK");
        } else {
            System.out.println("Array created - failed");


        }
    }

    public void shouldFindMaxNumber() {
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 6;
        array[2] = 78;
        array[3] = 98;
        array[4] = 12;

        ArrayUtil arrayUtil = new ArrayUtil();
        int max = arrayUtil.findMaxNumber(array);
        if (max == array[3]) {
            System.out.println("Max number in array - OK");
        } else {
            System.out.println("Max number in array - failed");
        }
    }

    public void shouldFindMinNumber() {
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 6;
        array[2] = 78;
        array[3] = 98;
        array[4] = 12;

        ArrayUtil arrayUtil = new ArrayUtil();
        int min = arrayUtil.findMinNumber(array);
        if (min == array[0]) {
            System.out.println("Min number in array - OK");
        } else {
            System.out.println("Min number in array - failed");
        }
    }

}
