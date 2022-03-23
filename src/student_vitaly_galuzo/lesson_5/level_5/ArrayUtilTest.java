package student_vitaly_galuzo.lesson_5.level_5;

import java.util.Random;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();


        arrayUtilTest.arrayLengthTest();
        arrayUtilTest.shouldFindMaxNumber();
        arrayUtilTest.shouldFindMinNumber();



    }

    public void arrayLengthTest() {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] actualResult = arrayUtil.createArray(5);
        if (actualResult.length > 0) {
            System.out.println("TEST = PASSED!");
        } else {
            System.out.println("TEST = FAILED!");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[5];

        array[0] = 2;          //Input data
        array[1] = 5;
        array[2] = 7;
        array[3] = 1;
        array[4] = 11;

        int actualResult = arrayUtil.findMaxNumber(array); // Call of Production code
        if (actualResult == array[4]) {
            System.out.println("TEST = PASSED!");          //Testing data
        } else {
            System.out.println("TEST = FAILED!");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[5];

        array[0] = 2;
        array[1] = 5;
        array[2] = 7;
        array[3] = 1;
        array[4] = 11;

        int actualResult = arrayUtil.findMinNumber(array);
        if (actualResult == array[3]) {
            System.out.println("TEST = PASSED!");
        } else {
            System.out.println("TEST = FAILED!");
        }
    }


















}
