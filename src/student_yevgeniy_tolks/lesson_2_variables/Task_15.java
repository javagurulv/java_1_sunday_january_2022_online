package student_yevgeniy_tolks.lesson_2_variables;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text:  ");
        String text = scan.nextLine();
        System.out.print("Enter some more text:  ");
        String text1= scan.nextLine();

        System.out.print(text+" ");
        System.out.print(text1);
    }
}
