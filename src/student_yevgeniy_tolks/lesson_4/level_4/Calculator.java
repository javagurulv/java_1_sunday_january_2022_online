package student_yevgeniy_tolks.lesson_4.level_4;

import java.util.Scanner;

//Task 11 - Calculator
class Calculator {

    public int sumOfTwoNumbers(int firstNumber  ,int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subOfTwoNumbers(int firstNumber,int secondNumber){
        return firstNumber-secondNumber;
    }
    public int mulOfTwoNumbers(int firstNumber,int secondNumber){
        return firstNumber*secondNumber;
    }

    public int divOfTwoNumbers(int firstNumber, int secondNumber){

        if(secondNumber==0) {
            System.out.println("Warning, can not divide on O!!!");
        }
       return firstNumber/secondNumber;
   }
   public boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
   }

}

class CalculatorDemo{

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Sum = " + calc.sumOfTwoNumbers(firstNumber,secondNumber));
        System.out.println("Sub = " + calc.subOfTwoNumbers(firstNumber,secondNumber));
        System.out.println("Mul = " + calc.mulOfTwoNumbers(firstNumber,secondNumber));
        System.out.println("Div = " + calc.divOfTwoNumbers(firstNumber,secondNumber));

        System.out.println();

        System.out.println("Sum result number is even - " + calc.isEven(calc.sumOfTwoNumbers(firstNumber,secondNumber)));
        System.out.println("Sub result number is even - " + calc.isEven(calc.subOfTwoNumbers(firstNumber,secondNumber)));
        System.out.println("Mul if number is even - " + calc.isEven(calc.mulOfTwoNumbers(firstNumber,secondNumber)));
        System.out.println("Div if number is even - " + calc.isEven(calc.divOfTwoNumbers(firstNumber,secondNumber)));
    }
}
