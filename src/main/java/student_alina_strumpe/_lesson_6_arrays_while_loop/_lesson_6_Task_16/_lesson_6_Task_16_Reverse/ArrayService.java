package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_16._lesson_6_Task_16_Reverse;

import java.util.Arrays;

class ArrayService {

    public int [] createArray(int arrayLength){ return new int[arrayLength];}

    public void fillArray(int[] array){
        for (int i=0; i<array.length;i++){
            array[i] = i + 1;
        }
    }

    public void reverseArray(int[] array, int start, int end) {
        int temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < array.length; i++) {
        }

    }

    public void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
        }
