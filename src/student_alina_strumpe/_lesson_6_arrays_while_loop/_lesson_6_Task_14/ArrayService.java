package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_14;

import java.util.Arrays;

class ArrayService {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int[] fillArray( int[] array, int numbers) {
        for(int i=0;i< array.length;i++){
              array[i] = numbers;
        }
        return array;
    }

    public boolean replaceFirstElementInArray(int[] array, int changeNumber, int newNumber) {
        boolean replace = false;
        for (int i = 0; i < array.length; i++) {
            if (array[0] == changeNumber) {
                array[0] = newNumber;
                return true;
            }
        }
        return replace;
    }
}


