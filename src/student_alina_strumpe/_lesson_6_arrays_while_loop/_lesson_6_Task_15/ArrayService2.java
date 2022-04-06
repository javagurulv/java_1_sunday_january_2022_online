package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_15;

import java.util.Arrays;
import java.util.Random;

 class ArrayService2 {

    public int[] createArray( int arrayLength){ return new int[arrayLength];}

    public void fillArray(int[] array,int number){
        for (int i=0; i< array.length; i++){
            array[i] = number;
            }
    }

     public int replaceALL(int[] array, int numberToReplace, int newNumber){
        for(int i=0; i< array.length; i++){
            if(array[i] == numberToReplace){
                array[i] = newNumber;
              //      break;                      menjaet tolko pervoe sovpadevie
            }
        }
        return newNumber;
    }
     public void printArray(int[] array, int numberToReplace, int newNumber){
         System.out.println(Arrays.toString(array)+", replaced numbers: "+numberToReplace+", new numbers: "+newNumber);
     }





 }
