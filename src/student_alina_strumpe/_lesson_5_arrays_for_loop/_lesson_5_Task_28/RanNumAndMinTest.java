package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_28;

import student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_27.ArrayRunNumbAndMaxTest;

public class RanNumAndMinTest {

    public static void main(String[] args){

        RanNumAndMinTest ranNumAndMinTest = new RanNumAndMinTest();
        ranNumAndMinTest.minInArrayTest1();
        ranNumAndMinTest.minInArrayTest2();

    }

    public void minInArrayTest1(){
        RanNumAndMin ranNumAndMin = new RanNumAndMin();
        int[] minInArray = {1,2,3,4,5};
        int actualResult = ranNumAndMin.findMinValueInArray(minInArray);

        if (actualResult == 1){
            System.out.println("Test 1 Find MIN value is OK");
        } else {
            System.out.println("Test 2 Find MIN value is FAILED");
        }
    }

    public void minInArrayTest2(){
        RanNumAndMin ranNumAndMin = new RanNumAndMin();
        int[] minInArray = {10,10,10,10};
        int actualResult = ranNumAndMin.findMinValueInArray(minInArray);

        if (actualResult == 10) {
            System.out.println("Test 2 Find MIN value is OK");
        } else {
        System.out.println("Test 2 Find MIN value is FAILED");
    }
    }
}

