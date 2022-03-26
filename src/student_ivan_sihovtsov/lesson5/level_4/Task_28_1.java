package student_ivan_sihovtsov.lesson5.level_4;

public class Task_28_1 {

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i = 1; i < inputArray.length;i++){ if(inputArray[i] < minValue){
            minValue = inputArray[i];
        }
        }
        return minValue;
    }

}
