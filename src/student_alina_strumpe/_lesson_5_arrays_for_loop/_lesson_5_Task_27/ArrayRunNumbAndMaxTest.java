package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_27;

public class ArrayRunNumbAndMaxTest {

    public static void main(String[] args){

        ArrayRunNumbAndMaxTest arrayRanNumbAndMaxTest = new ArrayRunNumbAndMaxTest();
        arrayRanNumbAndMaxTest.Test1MaxElement();
        arrayRanNumbAndMaxTest.Test2MaxElement();
    }

    //Test max array[i]
    public void Test1MaxElement() {
        ArrayRanNumbAndMax arrayRanNumbAndMax = new ArrayRanNumbAndMax();
        int[] maxInArray = {1,2,3,4};
        int actualResult = arrayRanNumbAndMax.findMaxInArray(maxInArray);

        if (actualResult == 4) {
            System.out.println("Test 1 Find MAX value is OK");
        } else {
            System.out.println("Test 1 Find MAX value is FAILED ");
        }
    }

    public void Test2MaxElement() {
        ArrayRanNumbAndMax arrayRanNumbAndMax = new ArrayRanNumbAndMax();
        int[] maxInArray = {0,0,0,0};
        int actualResult = arrayRanNumbAndMax.findMaxInArray(maxInArray);

        if(actualResult == 0){
            System.out.println("Test 2 Find MAX value is OK");
        } else {
            System.out.println("Test 2 Find MAX value is FAILED");
        }
    }
}
