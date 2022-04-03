package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_17_Sort;


import java.util.Arrays;
import java.util.Random;

class ArraySorting {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayRandomV(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
    }

    public void bubbleSort(int[] array) {
        int stepCount = array.length - 1;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < stepCount; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
            }
            stepCount--;
        }
        while (swapped);
    }

    public void bubbleSort2(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public void reversArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for (int i = 0; i < array.length; i++) {
        }
    }


    public void printFilledArray1(int[] array) {
        System.out.println(Arrays.toString(array) + " Filled array");
    }

    public void printSortedArray2(int[] array) {
        System.out.println(Arrays.toString(array) + " Sorted  ");
    }

    public void printReversedArray3(int[] array) {
        System.out.println(Arrays.toString(array) + " Reversed ");
    }

    public void sortArrayAscending1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp = 0;
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            // System.out.println(arr[i]);
        }
    }

    public void sortArrayAscending2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int a = array[i];
            while ((j > 0) && (array[j - 1] > a)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = a;
        }
    }

    public void sortArrayDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
        //    for (int i=0; i<=array.length-1;i++){
        }


    }
}




