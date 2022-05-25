package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_18_19_20;

import java.util.Scanner;

public class WhileInfiniteLoop {

    public static void main(String[] main){

        int number = 0;
        while (number < 20){
            System.out.println(number);

            if(number==0){
                break;
            }
        }

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Infinity");
            System.out.println("Insert number from 1 to 3: ");
            int userValue = scan.nextInt();
            if(userValue == 3){
                break;
            }
        }

    }
}
