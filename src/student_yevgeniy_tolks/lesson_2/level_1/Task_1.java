package student_yevgeniy_tolks.lesson_2.level_1;

import java.util.Scanner;

 class Task_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber=scanner.nextInt();

        int sum = firstNumber+secondNumber;
        int subtraction = firstNumber-secondNumber;
        int multiplication= firstNumber*secondNumber;


        System.out.println("Sum of two numbers: " +sum);
        System.out.println("Deduction of two numbers: " +subtraction);
        System.out.println("Multiplication of two numbers: " +multiplication);

        if(secondNumber==0){
            System.out.println("Can not / zero");
        }
        else{
            int division=firstNumber/secondNumber;
            System.out.println("Division of two numbers: " +division);
        }
    }
}
