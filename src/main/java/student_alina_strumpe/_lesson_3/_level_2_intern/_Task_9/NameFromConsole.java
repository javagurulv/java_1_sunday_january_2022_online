package student_alina_strumpe._lesson_3._level_2_intern._Task_9;

import java.util.Scanner;

public class NameFromConsole {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert your name: ");
        String userName = scan.nextLine();
        System.out.println("Hello "+userName+"!");

    }
}

