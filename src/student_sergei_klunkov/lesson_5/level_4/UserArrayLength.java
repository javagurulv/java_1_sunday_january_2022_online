package student_sergei_klunkov.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class UserArrayLength {

    // запросите у пользователя с консоли длину массива
    // создайте массив указанной пользователем длины
    // заполните массив числами полученными от пользователя
    // распечатайте на консоль все элементы массива.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print length of array: ");

        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println(" Amount of numbers: " + length);
            System.out.println(" Enter your numbers: ");
            array[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(array));

}

}

