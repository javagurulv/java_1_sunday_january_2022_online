package student_ivan_sihovtsov.lesson4.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        // запросить 3 числа

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        // вывести наибольшее
        // a, б, в
        // если "а" больше "б"
        // тогда "а" сравнивается с "в"

        if (firstNumber > secondNumber){
            int maxiOne = firstNumber;
            if (maxiOne > thirdNumber){
                System.out.println(maxiOne);
            } else {
                System.out.println(thirdNumber);
            }
        }

        // если "б" больше "а"
        // тогда "б" сравнивается с "в"

        if (secondNumber > firstNumber){
            int maxiTwo = secondNumber;
            if (maxiTwo > thirdNumber){
                System.out.println(maxiTwo);
            } else {
                System.out.println(thirdNumber);
            }
        }






    }

}
