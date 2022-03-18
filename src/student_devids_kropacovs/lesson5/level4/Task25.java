package student_devids_kropacovs.lesson5.level4;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        System.out.println("How long will be an array?");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int [] numbers = new int[arraySize];

        for ( int i = 0; i<arraySize; i++){
            System.out.print("Please enter number " + (i+1) + " of array: ");
            numbers[i] = scanner.nextInt();
        }

        for ( int i = 0; i<arraySize; i++){
            System.out.println("Number " + (i+1) + " of an array is " + numbers[i]);
        }
    }

}
