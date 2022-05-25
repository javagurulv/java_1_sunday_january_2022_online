package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_12;

import java.util.Arrays;
import java.util.Random;

class MasRandDemo {

    public static void main(String[] args){

        Random random = new Random();

        int[] flowersType = new int[3];
        int sum = 0;

        for (int i=0; i< flowersType.length;i++){
            int randomNumbers = random.nextInt(50);
            flowersType[i] = randomNumbers;
            sum += flowersType[i];

            //    System.out.println(Arrays.toString(mas));   // vivod - po odnomu drug za drugom  * 3
         //   System.out.println(mas[0]);
          //  System.out.println(mas[1]);
            //System.out.println(mas[2]);
            //System.out.println(sum);
        }
        System.out.println(Arrays.toString(flowersType));  // vivod massiv ponostju, kazhdij indeks, i summa
        System.out.println(flowersType[0]);
        System.out.println(flowersType[1]);
        System.out.println(flowersType[2]);
        System.out.println(sum);
    }
}
