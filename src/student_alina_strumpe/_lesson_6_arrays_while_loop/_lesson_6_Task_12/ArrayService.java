package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_12;

import java.util.Arrays;

 class ArrayService {


    public boolean containsInArrayTheNumber(int[] array, int numberToSearch) {
        boolean found = false;
        for (int element : array) {
            if (element == numberToSearch) {
                found = true;
                break;
            }
        }
        System.out.println(found);
        return found;
    }

    public void printArray(int[] array, int numberToSearch){
        System.out.println("Array: "+ Arrays.toString(array)+",  the searching number = "+numberToSearch);
    }
}
