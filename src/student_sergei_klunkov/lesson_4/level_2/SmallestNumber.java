package student_sergei_klunkov.lesson_4.level_2;

import java.util.Scanner;

class SmallestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number one...");
        int number1 = scanner.nextInt();
        System.out.println("Type the number two...");
        int number2 = scanner.nextInt();

        if(number1 < number2) {
            System.out.println("Number one is smallest!");
        } else
        if (number1 > number2){
            System.out.println("Number two is smallest!");
        } else
        if(number1 == number2){
            System.out.println("Numbers are similar!");
        }

    }


}
