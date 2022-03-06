package student_devids_kropacovs.devids_kropacovs_homeworks2;

import java.util.Scanner;

class Task1 {

    public static void main(String[] args) {
        System.out.print("Please, enter 1st number: ");
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();

        System.out.print("Please, enter 2nd number: ");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber+" + " + secondNumber + " = " + sum);

        int sub = firstNumber - secondNumber;
        System.out.println(firstNumber+" - " + secondNumber + " = " + sub);

        int div = firstNumber / secondNumber;
        System.out.println(firstNumber+" / " + secondNumber + " = " + div);

        int mul = firstNumber * secondNumber;
        System.out.println(firstNumber+" * " + secondNumber + " = " + mul);
    }
}
