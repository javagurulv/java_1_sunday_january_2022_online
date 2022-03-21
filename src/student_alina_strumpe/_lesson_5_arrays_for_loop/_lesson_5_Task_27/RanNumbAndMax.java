package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_27;

import java.util.Arrays;
import java.util.Random;

public class RanNumbAndMax {

    public static void main(String[] args){

        Random random = new Random();
         int[] studentMarks = new int[5];
         for (int i=0; i< studentMarks.length; i++){
             int marks = random.nextInt(11);
             studentMarks[i] = marks;
         }
         int max = 0;
         for (int i=0; i< studentMarks.length; i++) {
             if (studentMarks[i] > max) {
                 max = studentMarks[i];
             }
             System.out.println("["+i+"] = "+studentMarks[i]);
         }
             System.out.println("max = "+ max);
         }
    }

