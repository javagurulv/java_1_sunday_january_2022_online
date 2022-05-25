package student_aleksandra_jefimova.lesson_4.task_6;

import java.util.Scanner;

class Task_6_SmallestNumbeOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number One: ");
        int numberOne = scanner.nextInt();
        System.out.println("Insert number Two: ");
        int numberTwo = scanner.nextInt();
        if (numberOne < numberTwo) {
            System.out.println(numberOne);
        } else {
            System.out.println(numberTwo);
        }
    }
}
