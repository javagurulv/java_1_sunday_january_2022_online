package student_stanislav_astafjev.lesson_2.Task_9;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
    System.out.print("Input number  ");
    int number = new Scanner(System.in).nextInt();

    multiplicationTable(number);

}
    static void multiplicationTable(int number){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(number + " * "+ i +" = "+number*i);
        }


    }
}
