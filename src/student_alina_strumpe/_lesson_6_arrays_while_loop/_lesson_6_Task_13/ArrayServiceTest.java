package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_13;

public class ArrayServiceTest {

    public static void main(String[] args){

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.findOccurrence();
    }
    public void findOccurrence(){
        ArrayServices arrayServices = new ArrayServices();
        int[] testArray = {2,2,2,2,5,5,9,6};
        int expectedResult = 4;
      if (expectedResult == arrayServices.occurrenceInArray(testArray,2) ){
          System.out.println("Test is OK");
       } else {
         System.out.println("Test is FAIL");
       }
    }
    public void check(int expectedResult, int occurrence, String testName){}

    }

