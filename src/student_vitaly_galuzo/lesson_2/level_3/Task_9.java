package student_vitaly_galuzo.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        Scanner numb = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = numb.nextInt();

        for(int N=0; N<10;N++){
          System.out.println(number +" x "+(N+1)+" = "+ (number*(N+1)));

        }

    }

    }
