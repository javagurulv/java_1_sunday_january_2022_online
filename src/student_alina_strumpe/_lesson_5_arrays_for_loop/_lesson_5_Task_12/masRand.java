package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_12;

import java.util.Arrays;

public class masRand {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        for (int i=0; i < 3; i++) {
            numbers[i] = (int) (Math.random()*100);
            System.out.println(Arrays.toString(numbers));
        }
    }
}