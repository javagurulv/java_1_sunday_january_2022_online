package student_alina_strumpe._lesson_4_if._level_1_Task_4;

import java.util.Scanner;


class Divisor {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Insert number");
    int userNumber = scan.nextInt();
    if (userNumber%2 == 0){
        System.out.println("The number is even");
    } else {
        System.out.println("The number is odd");
    }

}


}
