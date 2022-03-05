package student_yevgeniy_tolks.lesson_4.level_3;

import java.util.Scanner;

 class Task_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter third number: ");
        double thirdNumber = scanner.nextDouble();

        // Option 1 - if statement including "and &&" operator

        if(firstNumber>secondNumber&&firstNumber>thirdNumber){
            System.out.println(firstNumber + " biggest number");
        }
        else if(secondNumber>firstNumber&&secondNumber>thirdNumber){
            System.out.println(secondNumber + " biggest number");

        }
        else if(thirdNumber>secondNumber && thirdNumber>firstNumber){
            System.out.println(thirdNumber + " biggest number" );
        }

        else {
            System.out.println("Numbers are equal");
        }
    }
}
