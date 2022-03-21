package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_34;

public class ArrayUtilPrint {

  //  public int[] createMarkArray(int array){ return new int[array];}

     public void printArrayToConsole(int[] number){
         for(int i=0 ; i < number.length ; i++ ){
             System.out.println("index ["+i+"] = "+number[i]);
         }
     }
}
