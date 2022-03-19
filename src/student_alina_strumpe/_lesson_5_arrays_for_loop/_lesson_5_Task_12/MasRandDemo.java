package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_12;

import java.util.Arrays;

class MasRandDemo {

    public static void main(String[] args){

        int[] mas = new int[3];
        int sum = 0;
        for (int i=0; i< mas.length;i++){
            mas[i]= (int)(Math.random()*100);
            sum += mas[i];           // zapolnenie mas + summa - mas+summa - .....
     //       System.out.println(Arrays.toString(mas));
            System.out.println(mas[0]);
            System.out.println(mas[1]);
            System.out.println(mas[2]);
            System.out.println(sum);
        }
        int sum2 =0;
        for (int numbers : mas){
            sum2 += numbers;
        System.out.println(Arrays.toString(mas));
            System.out.println(sum2);
        }




    }
}
