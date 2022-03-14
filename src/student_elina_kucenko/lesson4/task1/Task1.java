package student_elina_kucenko.lesson4.task1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int number = scanner.nextInt();
        if(number >=0){
            System.out.println("Your number is positive");
        }
        else {System.out.println("Your number is negative");}

    }
}
