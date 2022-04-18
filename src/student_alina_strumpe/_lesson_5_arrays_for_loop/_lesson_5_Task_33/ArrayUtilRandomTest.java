package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_33;

public class ArrayUtilRandomTest {

    public static void main(String[] args) {

        ArrayUtilRandomTest arrayUtilRandomTest = new ArrayUtilRandomTest();
        arrayUtilRandomTest.shouldCreateArray();
        arrayUtilRandomTest.shouldFillRandom();
       //   shouldNOTfill array  - ????
    }

    public void shouldCreateArray() {
        ArrayUtilRandom arrayUtilRandom = new ArrayUtilRandom();
        int[] createdArray = arrayUtilRandom.createMyArray(2);
        if (createdArray.length > 0) {
            System.out.println("Test should create is OK");
        } else {
            System.out.println("Test should create is FAILED");
        }
    }

    public void shouldFillRandom() {
        ArrayUtilRandom arrayUtilRandom = new ArrayUtilRandom();
        int[] testArray = new int[3];
        arrayUtilRandom.fillArrayRandomNumbers(testArray);
        int result = 0;
        int i;
        for (i = 0; i < testArray.length; i++) {
            result += testArray[i];
        }
        if (result > 0) {
            System.out.println("Test should fill array is OK");
        } else {
            System.out.println("\"Test should NOT fill array is FAIL\"");
        }
    }

}


