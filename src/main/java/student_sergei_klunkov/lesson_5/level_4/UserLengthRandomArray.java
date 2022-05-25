package student_sergei_klunkov.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class  UserLengthRandomArray {
    // - запросите у пользователя с консоли длину массива
    // - создайте массив указанной пользователем длины
    // - заполните массив случайными числами
    // - распечатайте на консоль все элементы массива.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print length of array: ");

        int length = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(50);
        }

        System.out.println(Arrays.toString(array));

        }





}
