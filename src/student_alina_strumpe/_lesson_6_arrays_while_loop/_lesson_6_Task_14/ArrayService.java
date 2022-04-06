package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_14;

import java.util.Arrays;

class ArrayService {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArray( int[] array, int numbers) {
        for(int i=0;i< array.length;i++){
              array[i] = numbers;

        }
    }

    public boolean replaceFirstElementInArray(int[] array, int changeNumber, int newNumber) {
        boolean replace = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == changeNumber) {
                array[i] = newNumber;
                replace = true;
                break;      // nahodit pervoe sovpadenie i srazu zavershaetsja cikl
            }
        }
        return replace;
    }

    public void printArray(int[] array, int changeNumber, int newNumber){
        System.out.println(Arrays.toString(array) + ", changed number is  "+changeNumber+ ", number for replace is "
                +newNumber);
    }
}


