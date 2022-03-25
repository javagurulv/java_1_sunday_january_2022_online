package student_ivan_sihovtsov.lesson5.level_4;

public class Task_27_1 {

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i = 1; i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }

}
