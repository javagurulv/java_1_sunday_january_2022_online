package student_aleksandra_jefimova.lesson_3.level_2.task_7.task_9;

import java.util.Scanner;

class ReadingStringFromConsole {
    public static void main(String[] args) {

        //ask username
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.next();

        //print "Hello UserName!"
        System.out.println("Hello " + username + "!");

    }
}