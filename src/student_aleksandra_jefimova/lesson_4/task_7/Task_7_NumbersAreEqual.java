package student_aleksandra_jefimova.lesson_4.task_7;

import java.util.Scanner;
class Task_7_NumbersAreEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number One: ");
        int numberOne = scanner.nextInt();
        System.out.println("Insert number Two: ");
        int numberTwo = scanner.nextInt();
        if (numberOne == numberTwo) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }

}
