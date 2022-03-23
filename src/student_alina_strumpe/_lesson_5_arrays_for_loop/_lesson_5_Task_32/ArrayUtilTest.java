package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_32;

import java.util.Arrays;

class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumbers = arrayUtil.createNewArray(5);
        System.out.println(Arrays.toString(arrayNumbers));


        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldCreateArray();

    }

      public void shouldCreateArray(){
          ArrayUtil arrayUtil = new ArrayUtil();

          int[] array = arrayUtil.createNewArray(4);
          if(array.length > 0){
            System.out.println("\"Test should create Array is OK\"");
          } else {
              System.out.println("\"Test should create Array is FAILED\"");
          }







      }

}
