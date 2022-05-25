package student_alina_strumpe.lesson_2_level_2_intern_Task_6;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args){


        Scanner sk = new Scanner(System.in);
        System.out.print("Insert your name: ");
        String name = sk.next();
        System.out.printf("Hello %s!",name);

    }
}
