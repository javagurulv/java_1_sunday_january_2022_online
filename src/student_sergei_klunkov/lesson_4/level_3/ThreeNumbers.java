package student_sergei_klunkov.lesson_4.level_3;

import java.util.Scanner;

class ThreeNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the number one...");
        int number1 = scanner.nextInt();
        System.out.println("Type the number two...");
        int number2 = scanner.nextInt();
        System.out.println("Type the number three...");
        int number3 = scanner.nextInt();


        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
        }

        else if (number1!=number2 && number2 != number3) {
            System.out.println("All numbers are different");
        }
        else{

            System.out.println("Neither all are equal or different");

    }

    }

}



