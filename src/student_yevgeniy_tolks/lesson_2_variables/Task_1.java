package student_yevgeniy_tolks.lesson_2_variables;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber=scanner.nextInt();

        int sum = firstNumber+secondNumber;
        int deduction = firstNumber-secondNumber;
        int multiplication= firstNumber*secondNumber;


        System.out.println("Sum of two numbers: " +sum);
        System.out.println("Deduction of two numbers: " +deduction);
        System.out.println("Multiplication of two numbers: " +multiplication);

        if(secondNumber==0){
            System.out.println("Can not / zero");
        }
        else{
            int division=firstNumber/secondNumber;
            System.out.println("Sum of two numbers: " +division);
        }
    }
}
