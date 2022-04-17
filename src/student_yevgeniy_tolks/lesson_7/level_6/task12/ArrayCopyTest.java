package student_yevgeniy_tolks.lesson_7.level_6.task12;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.isArrayCopyTest();
    }

    public void isArrayCopyTest() {
        int[] inTestArray = {21, 1, 3, 9, 3, 2, 9, 12};
        int[] outTestArray = {0, 1, 3, 0, 3, 2, 0, 0};

        ArrayCopy arrayCopy = new ArrayCopy();
        int[] resultOfArrayCopy = arrayCopy.copyInRange(inTestArray, 0, inTestArray.length);
        if (Arrays.equals(outTestArray, resultOfArrayCopy)) {
            System.out.println("Array copy following the statement - TEST OK");
        } else {
            System.out.println("Array copy following task statement - FAILED");
        }
    }

}
