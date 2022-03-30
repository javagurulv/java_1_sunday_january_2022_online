package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_13;

public class ArrayServices {


    public int occurrenceInArray(int[] array, int numberForSearch){
        int occ = 0;
        for(int elementInArray : array)
            if(numberForSearch == elementInArray){
                occ++;
            }
        return occ;
    }
}
