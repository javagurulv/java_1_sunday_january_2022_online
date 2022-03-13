package student_yevgeniy_tolks.lesson_5.level_5;

import java.util.Arrays;

class ArrayUtil {

    public int[] createArray(int arrayLenght) {
        return new int[arrayLenght];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 500);
        }
    }

    public void printArrayToConsole(int[] array) {
        for(int printArray: array){
           // System.out.print(printArray + " " );
        }
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for(int i=0;i< array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for(int i=0;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
 }


