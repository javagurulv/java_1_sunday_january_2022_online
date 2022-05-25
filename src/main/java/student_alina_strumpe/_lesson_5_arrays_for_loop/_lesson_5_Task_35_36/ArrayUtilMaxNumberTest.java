package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_35_36;

public class ArrayUtilMaxNumberTest {
     public static void main(String[] args){

         ArrayUtilMaxNumberTest arrayUtilMaxNumberTest = new ArrayUtilMaxNumberTest();
         arrayUtilMaxNumberTest.shouldFindMaxValueInArrayTest1();
         arrayUtilMaxNumberTest.shouldFindMaxValueInArrayTest2();
     }

     public void shouldFindMaxValueInArrayTest1(){
         ArrayUtilMaxNumber arrayUtilMaxNumber = new ArrayUtilMaxNumber();
         int[] maxInArray = {2,5,100,78};
         int actualResult = arrayUtilMaxNumber.findMaxNumber(maxInArray);
         if (actualResult ==100){
             System.out.println("Test find MAX value is OK");
         } else {
             System.out.println("Test 1 find MAX value is FAIL");
         }
     }

     public void shouldFindMaxValueInArrayTest2(){
         ArrayUtilMaxNumber arrayUtilMaxNumber = new ArrayUtilMaxNumber();
         int[] myArray = new int[3];
         myArray[0] = 4;
         myArray[1] = 4;
         myArray[2] = 4;
         int maxValue = arrayUtilMaxNumber.findMaxNumber(myArray);
         if(maxValue == myArray[2]){
             System.out.println("Test 2 find MAX is OK");
         } else {
             System.out.println("Test 2 find MAX is FAIL");
         }



     }
}
