package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_13;

import java.util.Arrays;

 class ArrayServices {

    public int[] createArray(int arrayLength){ return new int[arrayLength];}

     public void fillArray(int[] array, int number){
        for(int i=0;i<array.length;i++){
            array[i] = number;
            i++;
        }
     }
    public int occurrenceInArray(int[] array, int numberForSearch){
        int occ = 0;
        for(int elementInArray : array)
            if(numberForSearch == elementInArray){
                occ++;
            }
        return occ;
    }

    public void printArray(int[] array, int occurrenceNUmber, int numberForSearch){
        System.out.println(Arrays.toString(array)+ " ,occurrence number is "+occurrenceNUmber+", number for search: "+
                numberForSearch);
    }
}
