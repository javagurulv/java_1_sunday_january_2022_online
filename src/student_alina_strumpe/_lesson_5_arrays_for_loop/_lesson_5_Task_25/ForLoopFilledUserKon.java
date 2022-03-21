package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_25;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoopFilledUserKon {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Insert array length: ");
        int arrayLength = scan.nextInt();

        int[] mas1 = new int[arrayLength]; // !!!

        for(int i=0; i< mas1.length;i++) {
            int userNumbers = scan.nextInt();
            mas1[i] = userNumbers;
        }
           System.out.println(Arrays.toString(mas1));
        }

        }



