package student_elina_kucenko.lesson7.level6;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.arrayCopy();

    }

    public void arrayCopy() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] testArray = {5, 3, 1, 5, 8, 0, 12, 6, 8};
        int[] expectedResult = {5, 3, 5, 6};
        if (Arrays.equals(arrayCopy.copyInRange(testArray, 3, 6), expectedResult)) {
            System.out.println("Arrays copied in range test - OK");
        } else {
            System.out.println("Arrays copied in range test - Failed");
        }
    }
}
