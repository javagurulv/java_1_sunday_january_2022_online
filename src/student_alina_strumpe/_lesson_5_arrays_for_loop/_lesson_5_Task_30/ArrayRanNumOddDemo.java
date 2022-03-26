package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_30;

public class ArrayRanNumOddDemo {

    public static void main(String[] args) {
        ArrayRanNumOdd arrayRanNumOdd = new ArrayRanNumOdd();
        int[] arrayNumbers = arrayRanNumOdd.SetArray(6);
        arrayRanNumOdd.fillArrayWithRandomNumbers(arrayNumbers);
        arrayRanNumOdd.printNewArray(arrayNumbers);
        arrayRanNumOdd.printOddNumberInArray(arrayNumbers);



   /*      ArrayRanNumOddTest arrayRanNumOddTest = new ArrayRanNumOddTest();
         arrayRanNumOddTest.oddNumberInArrayTest1();
     }

     public void oddNumberInArrayTest1(){
         ArrayRanNumOdd arrayRanNumOdd = new ArrayRanNumOdd();
         int[] oddNumbers = {3,2,5,8};
         int actualResult = arrayRanNumOdd.printOddNumberInArray(oddNumbers);

         if(actualResult != 0){
             System.out.println("Test 1 find Odd number is OK");
         }else {
             System.out.println("Test 1 find Odd number is FAILED");
         }
     }*/
    }
}