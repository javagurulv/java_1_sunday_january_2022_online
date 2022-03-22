package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_31;

import java.sql.Array;

public class ArrayUtilTest {
    public static void main(String[] args){

        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.createArrayTest();
    }


    public void createArrayTest(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayLength = new int[4];
        int[] actualResult = arrayUtil.createNumberArray(4);
        check(actualResult, "createArrayTest");
    }

    public void check(int[] actualResult, String name){
        if (actualResult == new int[4]){
            System.out.println("Test "+name+" is OK");
        } else {
            System.out.println("Test "+name+" is FAIL");
     //       System.out.println("Expected result: "+expectedResult+" but actual result: "+actualResult);
        }
    }
}
