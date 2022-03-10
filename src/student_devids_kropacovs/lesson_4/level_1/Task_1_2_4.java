package student_devids_kropacovs.lesson_4.level_1;

import java.util.Scanner;

public class Task_1_2_4 {
    public static void main(String[] args) {

        System.out.print("Please enter a number : ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        if (x > 0){
            System.out.println("Your number is positive!");
        }else if (x<0) {
            System.out.println("Your number is negative!");
        }else{
            System.out.println("Your number is 0");
        }

        if(x % 2 == 1){
            System.out.println("Number " + x + " is odd");
        }else{
            System.out.println("Number " + x + " is even");
        }
    }
}
