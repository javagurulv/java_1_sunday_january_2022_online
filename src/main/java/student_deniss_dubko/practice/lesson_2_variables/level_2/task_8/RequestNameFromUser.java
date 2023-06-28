package student_deniss_dubko.practice.lesson_2_variables.level_2.task_8;

import java.util.Scanner;

class RequestNameFromUser {

    public static void main(String[] args) {

        Scanner getUserName = new Scanner(System.in);

        System.out.println("Enter name: ");
        String userName = getUserName.next();
        System.out.println("Hello, " + userName + "!");
    }

}