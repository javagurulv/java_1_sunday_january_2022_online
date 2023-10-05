package student_deniss_dubko.practice.lesson_5_arrays;

import java.util.Scanner;

class Array {

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 53;
        marks[1] = 7;
        marks[2] = 77;
        System.out.println(marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println();

        int[] numbersFromUser = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers:");
        numbersFromUser[0] = scanner.nextInt();
        numbersFromUser[1] = scanner.nextInt();
        numbersFromUser[2] = scanner.nextInt();
        System.out.println(numbersFromUser[0] + ", " + numbersFromUser[1] + ", " + numbersFromUser[2]);
    }

}