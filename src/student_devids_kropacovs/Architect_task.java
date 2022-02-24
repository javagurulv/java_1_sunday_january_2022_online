package student_devids_kropacovs;

import java.util.Scanner;

/*
This should ask if you are Mr or Ms, then ask your name and write it down
 */
public class Architect_task {
    public static void main(String[] args) {
        System.out.print("Please, press 1 if you are Mr, press 2 if you are MS");
        Scanner scannerGender = new Scanner(System.in);
        int gender = scannerGender.nextInt();
        if (gender ==1 || gender == 2) {

            System.out.print("Please, write your name: ");
            Scanner scannerName = new Scanner(System.in);
            String name = scannerName.next();

            System.out.print("What is your age? ");
            Scanner scannerAge = new Scanner(System.in);
            int age = scannerAge.nextInt();

            if (gender == 1) {
                if (age < 18) {
                    System.out.println("Hello! Mr. " + name + " You are minor age");
                } else {
                    System.out.println("Hello! Mr. " + name + " You are adult");
                }
            } else {
                if (age < 18) {
                    System.out.println("Hello! Ms. " + name + " You are minor age");
                } else {
                    System.out.println("Hello! Ms. " + name + " You are adult");
                }
            }
        }else{
            System.out.println("You pressed invalid number, start program again");
        }

    }
}
