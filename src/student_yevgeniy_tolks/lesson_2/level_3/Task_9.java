package student_yevgeniy_tolks.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();

        System.out.println("Output: ");
        for(int i=1;i<=10;i++){
            int multiplication_table_result=number*i;
            System.out.println(number + " x "+ i + " = " + multiplication_table_result);
        }
    }
}
