package student_alina_strumpe._lesson_4_if._level_1_Task_5;

import java.util.Scanner;

 class Min_Max {

    public static void main(String[] args){

        int[] mas = new int[2];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i < 2;i++) {
            System.out.print("Insert  numbers: ");
            int number = scan.nextInt();
            mas[i] = number;}

            int max = mas[0];

            if (mas[1] > max)
                max = mas[1];

            System.out.println("max: "+max);

//            int number = scan.nextInt();  // i < 4  int[4]
//            mas[i] = number;}
//
//            int max = mas[0];
//
//            if (mas[3] > max)   // 2- index 0,1,2
//                max = mas[3];
//
//                System.out.println(max);

        }
    }

