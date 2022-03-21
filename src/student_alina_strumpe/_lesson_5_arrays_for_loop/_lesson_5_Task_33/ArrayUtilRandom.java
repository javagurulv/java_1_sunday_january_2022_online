package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_33;

public class ArrayUtilRandom {
            java.util.Random random = new java.util.Random();
    public void fillArrayRandomNumbers(int[] array){
        for(int i=0; i< array.length; i++){
        int arrayNumbers = random.nextInt(50);
        array[i] = arrayNumbers;
        System.out.println("["+i+"] = "+array[i]);
    }
    }
}
