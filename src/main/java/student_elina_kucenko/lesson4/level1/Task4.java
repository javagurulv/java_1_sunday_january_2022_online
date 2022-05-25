package student_elina_kucenko.lesson4.level1;

import java.util.Scanner;

 class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("Your number is even");
        }
        else {
            System.out.println("Your number is odd");
        }
    }
}
