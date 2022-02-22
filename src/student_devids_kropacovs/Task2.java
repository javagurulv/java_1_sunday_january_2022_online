package student_devids_kropacovs;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.print("Please, enter 1st number: ");
        Scanner scanner1 = new Scanner(System.in);
        double firstNumber = scanner1.nextDouble();

        System.out.print("Please, enter 2nd number: ");
        Scanner scanner2 = new Scanner(System.in);
        double secondNumber = scanner2.nextDouble();

        double sum = firstNumber + secondNumber;
        System.out.println(firstNumber+" + " + secondNumber + " = " + sum);

        double sub = firstNumber - secondNumber;
        System.out.println(firstNumber+" - " + secondNumber + " = " + sub);

        double div = firstNumber / secondNumber;
        System.out.println(firstNumber+" / " + secondNumber + " = " + div);

        double mul = firstNumber * secondNumber;
        System.out.println(firstNumber+" * " + secondNumber + " = " + mul);
    }
}
