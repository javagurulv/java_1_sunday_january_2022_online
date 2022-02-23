package student_yevgeniy_tolks.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber=scanner.nextDouble();

        double sum = firstNumber+secondNumber;
        double deduction = firstNumber-secondNumber;
        double multiplication= firstNumber*secondNumber;


        System.out.println("Sum of two numbers: " +sum);
        System.out.println("Deduction of two numbers: " +deduction);
        System.out.println("Multiplication of two numbers: " +multiplication);

        if(secondNumber==0){
            System.out.println("Can not / zero");
        }
        else{
            double division=firstNumber/secondNumber;
            System.out.println("Sum of two numbers: " +division);
        }
    }
}
