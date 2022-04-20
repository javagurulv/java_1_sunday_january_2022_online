package student_sergei_klunkov.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {

    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.isArrayCopyTest();
    }

    public void isArrayCopyTest() {
        int[] numbersInTestArray = {11, 1, 3, 9, 3, 2, 9, 11};
        int[] numbersOutTestArray = {0, 1, 3, 0, 3, 2, 0, 0};

        ArrayCopy arrayCopy = new ArrayCopy();
        int[] arrayCopyResult = arrayCopy.copyInRange(numbersInTestArray, 0, numbersInTestArray.length);
        if (Arrays.equals(numbersOutTestArray, arrayCopyResult)) {
            System.out.println(" Test passed! ");
        } else {
            System.out.println(" Test failed! ");
        }
    }

}
