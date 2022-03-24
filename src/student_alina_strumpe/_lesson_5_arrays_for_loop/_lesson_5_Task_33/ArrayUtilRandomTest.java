package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_33;

public class ArrayUtilRandomTest {

    public static void main(String[] args){

        ArrayUtilRandomTest arrayUtilRandomTest = new ArrayUtilRandomTest();
        arrayUtilRandomTest.shouldCreateArray();
    }

    public void shouldCreateArray(){
        ArrayUtilRandom arrayUtilRandom = new ArrayUtilRandom();
        int[] createdArray = arrayUtilRandom.createMyArray(2);
        if(createdArray.length > 0){
            System.out.println("Test should create is OK");
        } else{
            System.out.println("Test should create is FAILED");
        }
    }
}
