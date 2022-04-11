package student_elina_kucenko.lesson6.level3;

import java.util.Arrays;

 class ArrayService {

     public boolean checkIfNumberIsInArray(int numberToCheck, int[] array) {
         for (int i = 0; i < array.length; i++) {
             if (array[i] == numberToCheck) {
                 return true;
             }
         }
         return false;
     }

    public int checkHowManyTimesNumberIsInArray(int numberToCheck, int[] array) {
        int repeatTimes = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a] == numberToCheck) {
                repeatTimes = repeatTimes + 1;
            }
        }
        return repeatTimes;
    }

    public boolean changeFirstOccurence(int numberToChange, int[] array, int changedNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToChange) {
                array[i] = changedNumber;
                return true;
            }

        }
        return false;
    }

    public int changeAllOccurencies(int numberToChange, int[] array, int changedNumber) {
        int occurencies = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToChange) {
                array[i] = changedNumber;
                occurencies++; //increased occurencies to +1
            }
        }
        return occurencies;
    }

    public void revertArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int reversedArray = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = reversedArray;
        }
    }

    public void sortArray(int[] array) {
        int position;
        int temporary;
        for (int i = 0; i < array.length; i++) {
            position = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[position]) {
                    position = j;
                }
            }
            temporary = array[position];
            array[position] = array[i];
            array[i] = temporary;
        }
    }

    // array.sort function
    public int[] sortingArrayAuto(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted array is " + Arrays.toString(array));
        return array;
    }
}




