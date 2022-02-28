package student_devids_kropacovs.devids_kropacovs_homeworks2;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        System.out.print("Please, enter 1st number: ");
        Scanner scanner1 = new Scanner(System.in);
        int numberOne = scanner1.nextInt();

        System.out.print("Please, enter 2nd number: ");
        Scanner scanner2 = new Scanner(System.in);
        int numberTwo = scanner2.nextInt();

        System.out.print("Please, enter 3rd number: ");
        Scanner scanner3 = new Scanner(System.in);
        int numberThree = scanner3.nextInt();

        double result = (numberOne + numberTwo + numberThree)/3.0;
        System.out.println("Average is " + result);
    }
}
