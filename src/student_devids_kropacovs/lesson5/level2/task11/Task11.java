package student_devids_kropacovs.lesson5.level2.task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        for (int i = 0; i< numbers.length; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please, enter number "+ (i+1) + " from array: ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i< numbers.length; i++){
            System.out.println("Number "+ (i+1) + " from arrays is "+ numbers[i]);
        }
    }
}
