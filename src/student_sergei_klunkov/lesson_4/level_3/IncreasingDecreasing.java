package student_sergei_klunkov.lesson_4.level_3;

import java.util.Scanner;

class IncreasingDecreasing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print first number...");
        int number1 = scanner.nextInt();
        System.out.println("Print second number...");
        int number2 = scanner.nextInt();
        System.out.println("Print third number...");
        int number3 = scanner.nextInt();

        int x;

        if (number1>number2){
            x=number1; number1 = number2; number2=x;
        } else number1=number1;
        if (number2>number3){
            x=number2; number2=number3; number3 = x;
        } else number2=number2;
        if (number1 > number2) {
            x = number1; number1 = number2; number2 = x;}
        else number3= number3;
        System.out.println("Increasing..." + number1 + " " + number2 + " " + number3);

        int y;

        if (number1<number2){
            x=number1; number1 = number2; number2=x;
        } else number1=number1;
        if (number2<number3){
            x=number2; number2=number3; number3 = x;
        } else number2=number2;
        if (number1 < number2) {
            x = number1; number1 = number2; number2 = x;}
        else number3= number3;
        System.out.println("Decreasing..." + number1 + " " + number2 + " " + number3);

    }

}

