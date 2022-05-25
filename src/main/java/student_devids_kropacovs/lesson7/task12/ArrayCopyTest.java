package student_devids_kropacovs.lesson7.task12;

import java.util.Arrays;

public class ArrayCopyTest {

    public static void main(String[] args) {

        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.copiedArrayTest();

    }

    public void copiedArrayTest(){
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] firstArray= {2, 3, 5, 2, 7, 8, 4, 1, 3};
        int[] expectedResult = {3, 5, 7, 4, 3};
        int[] realResult = arrayCopy.copyInRange(firstArray, 3, 7);

        if(Arrays.equals(expectedResult, realResult)){
            System.out.println("Array Copy test PASS");
        }else{
            System.out.println("Array Copy test FAIL");
        }
    }
}
