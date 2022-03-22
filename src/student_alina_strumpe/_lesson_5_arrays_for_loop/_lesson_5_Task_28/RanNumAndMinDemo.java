package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_28;

public class RanNumAndMinDemo {

    public static void main(String[] args){

        RanNumAndMin ranNumAndMin = new RanNumAndMin();
        int[] arrayElements = ranNumAndMin.setArray(7);
        ranNumAndMin.fillArrayWithRandomValue(arrayElements);
        ranNumAndMin.printArray(arrayElements);
        int minValueInArray = ranNumAndMin.findMinValueInArray(arrayElements);
        System.out.println("min: "+minValueInArray);


    }
}
