package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_2_intern;

import java.util.Scanner;

class Task9ReadFromConsole {

    public static void main(String args[]) {

        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Your name: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");

        // closing scanner
        in.close();
    }


}
