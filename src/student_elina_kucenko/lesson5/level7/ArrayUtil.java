package student_elina_kucenko.lesson5.level7;

import java.util.Arrays;
import java.util.Scanner;

class ArrayUtil {

    public int enterSizeLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of array");
        int arrayLength = scanner.nextInt();
        return arrayLength;
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number that will be in array");
            array[i] = scanner.nextInt();
        }
    }

    public void printArray(int[] array) {
        System.out.println("Your array consist of: " + Arrays.toString(array));
    }

    public void arrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public int findMinNumber(int[] array) {
        int min = array[0];

        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public void findEvenNumber(int[] array) {

        for (int evenNumber : array) {
            if (evenNumber % 2 == 0) {

                System.out.println("Even numbers in array:" + evenNumber);
            }
        }
    }

    public void findNotEvenNumber(int[] array) {
        for (int notEvenNumbers : array) {
            if (notEvenNumbers % 2 != 0) {
                System.out.println("Not even numbers in array: " + notEvenNumbers);
            }
        }
    }
}