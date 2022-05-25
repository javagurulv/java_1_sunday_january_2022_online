package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_34;

public class ArrayUtilPrintTest {

    public static void main(String[] args){
        ArrayUtilPrintTest arrayUtilPrintTest = new ArrayUtilPrintTest();
        arrayUtilPrintTest.shouldCreateArrayTest();
    }
    public void shouldCreateArrayTest(){
        ArrayUtilPrint arrayUtilPrint = new ArrayUtilPrint();
        int[] array = arrayUtilPrint.createArray(5);
        if(array.length > 0){
            System.out.println("Test Create Array is OK");
        } else {
            System.out.println("Test Create Array is FAIL");
        }

    }
}
