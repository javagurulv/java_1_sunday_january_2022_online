package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ForLoopUserlengRandomNum {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int arrayLength = scan.nextInt();
        int[] userArray = new int[arrayLength];

        for(int i=0;i < userArray.length; i++){
            int userNumbers = random.nextInt(100);
            userArray[i] = userNumbers;
        System.out.println("["+i+"]" +"="+ userArray[i]);
        }
        System.out.println(Arrays.toString(userArray));

    }

}
