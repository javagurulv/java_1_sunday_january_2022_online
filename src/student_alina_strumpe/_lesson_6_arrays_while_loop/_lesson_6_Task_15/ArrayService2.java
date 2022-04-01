package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_15;

import java.util.Random;

 class ArrayService2 {

    public int[] createArray( int arrayLength){ return new int[arrayLength];}

    public int fillArray(int[] array,int number){
        for (int i=0; i< array.length; i++){
            array[i] = number;
            }
        return number;
    }

     public int replaceALL(int[] array, int numberToReplace, int newNumber){
        for(int i=0; i< array.length; i++){
            if(array[i] == numberToReplace){
                array[i] = newNumber;
            }
        }
        return newNumber;
    }

}
