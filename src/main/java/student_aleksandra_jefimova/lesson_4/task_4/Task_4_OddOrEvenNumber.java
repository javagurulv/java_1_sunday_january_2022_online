package student_aleksandra_jefimova.lesson_4.task_4;

import java.util.Scanner;

class Task_4_OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
        System.out.println("Number is even ");
        }
        else {
            System.out.println("Number is odd ");
        }

        }

}
