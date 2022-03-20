package student_deniss_dubko.work_in_class;

import java.util.Scanner;

class ArrayExample {

        public static void main(String[] args) {

        // 9, 3, 4, 6

        int mark1 = 9;
        int mark2 = 3;
        int mark3 = 4;
        int mark4 = 6;

        // index - 0 1 2 3

        int[] marks = new int[4]; // one type (or int, or double, or string, or...)

        // new - new object
        // [4] - количество переменных


        // Можно взять данные с консоли
        // Scanner scanner = new Scanner(System.in);
        // int arrayLength = scanner.nextInt();

        // int[] marks = new int[arrayLength];

        printArrayToConsole(marks);

        marks[0] = 9;
        marks[1] = 3;
        marks[2] = 4;
        marks[3] = 6;

        printArrayToConsole(marks);

        int sum = marks[0] + marks[1] + marks[2] + marks[3];
        System.out.println(sum);

        System.out.println("Длина массива " + marks.length);

        marks[0] = 90;
        marks[1] = 39;
        marks[2] = 40;
        marks[3] = 99;

        printArrayToConsole(marks);
    }

    static void printArrayToConsole(int[] marks) {

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
    }


}
