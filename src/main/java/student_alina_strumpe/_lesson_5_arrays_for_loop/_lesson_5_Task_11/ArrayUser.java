package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_11;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUser {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
//        int number1 = scan.nextInt();
//        int number2 = scan.nextInt();
//        int number3 = scan.nextInt();
//        int [] numbers = {number1,number2,number3};
//        System.out.println(Arrays.toString(numbers)); int userNumbers = scan.nextInt();


        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            int userNumbers = scan.nextInt();
            numbers[i] = userNumbers;
            System.out.println("index: " + i);
        }
            System.out.println(Arrays.toString(numbers));
        }
}



