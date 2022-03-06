package student_elina_kucenko.lesson2.level7;

import java.util.Scanner;

class Task32 {
    public static void main(String[] args) {
        //adding username
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        String username = scanner.next();

        /*greeting for the new user
        in console */
        System.out.println("Greetings, " + username + "!");
    }
}
