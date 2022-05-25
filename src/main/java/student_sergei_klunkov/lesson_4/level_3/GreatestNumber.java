package student_sergei_klunkov.lesson_4.level_3;


import java.util.Scanner;

class GreatestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number...");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number...");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number...");
        int num3 = scanner.nextInt();

        // Задача: консоль должна показывать наибольшее целое число

         if(num1>num2 && num1>num3) {
             System.out.println("Number " + num1 + " is greatest!");
         } else if(num2>num1&& num2>num3) {
             System.out.println("Number " + num2 + " is greatest!");
         } else if(num3>num1&&num3>num2) {
             System.out.println("Number " + num3 + " is greatest!");
         }



    }

}
