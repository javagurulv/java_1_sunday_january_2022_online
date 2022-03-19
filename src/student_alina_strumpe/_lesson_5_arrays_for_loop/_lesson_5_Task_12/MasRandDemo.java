package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_12;

import java.util.Arrays;

class MasRandDemo {

    public static void main(String[] args){

        int[] mas = new int[3];
        int sum = 0;
        for (int i=0; i< mas.length;i++){
            mas[i]= (int)(Math.random()*100);
            sum += mas[i];
            //    System.out.println(Arrays.toString(mas));   // vivod - po odnomu drug za drugom  * 3
         //   System.out.println(mas[0]);
          //  System.out.println(mas[1]);
            //System.out.println(mas[2]);
            //System.out.println(sum);
        }
        System.out.println(Arrays.toString(mas));  // vivod massiv ponostju, kazhdij indeks, i summa
        System.out.println(mas[0]);
        System.out.println(mas[1]);
        System.out.println(mas[2]);
        System.out.println(sum);
    }
}
