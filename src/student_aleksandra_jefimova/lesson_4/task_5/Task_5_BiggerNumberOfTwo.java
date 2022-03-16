package student_aleksandra_jefimova.lesson_4.task_5;

import java.util.Scanner;

public class Task_5_BiggerNumberOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number One: ");
        int numberOne = scanner.nextInt();
        System.out.println("Insert number Two: ");
        int numberTwo = scanner.nextInt();
        if (numberOne > numberTwo) {
            System.out.println(numberOne);
        } else {
             System.out.println(numberTwo);
    }
    }
}


