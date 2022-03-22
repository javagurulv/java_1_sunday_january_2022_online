package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_29;

public class ArrayRandomElemAndEvenDemo {

    public static void main(String[] args){

        ArrayRandomElemAndEven arrayRandomElemAndEven = new ArrayRandomElemAndEven();
        int[] setArray = arrayRandomElemAndEven.setArray(10);
        arrayRandomElemAndEven.fillArrayWithRandomElements(setArray);
        arrayRandomElemAndEven.printRandomFilledArray(setArray);
        arrayRandomElemAndEven.printEvenElementsInArray(setArray);


    }
}
