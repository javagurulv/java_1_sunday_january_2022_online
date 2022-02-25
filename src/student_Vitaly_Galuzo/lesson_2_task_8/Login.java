package student_Vitaly_Galuzo.lesson_2_task_8;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        System.out.println("Type your username to log in:");
        String username= scr.nextLine();
        System.out.println("Hello"+" "+ username+"!");

    }
    
}