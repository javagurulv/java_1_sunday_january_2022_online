package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_14;

import java.util.Arrays;

public class RandAndAverage {

    public static void main(String[] args){

        int[] mas1 = new int[3];
        int sum = 0;
        for(int i=0; i< mas1.length;i++){
            mas1[i] = (int) (Math.random()*100);
            sum += mas1[i];
        }
        double mean;
        mean = sum/(double)mas1.length;
        System.out.println(Arrays.toString(mas1));
        System.out.println(sum);
        System.out.println(mean);


    }
}
