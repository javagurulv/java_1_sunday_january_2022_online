package student_elina_kucenko.lesson3.level2;

import java.util.Scanner;

public class Task9Hello {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name!");
         String myName = scanner.next();


        String greeting="Hi "+myName+"!";
        System.out.println(greeting);
        }
}
