package student_aleksandrs_padalko.lesson_4.level_3.task_9;

import java.util.Scanner;

class IncreasingOrDecreasing {public static void main(String[] args) {
    int number1, number2, number3;
    Scanner sc = new Scanner(System.in);

    System.out.print(" Please Enter the First Number : ");
    number1 = sc.nextInt();

    System.out.print(" Please Enter the Second Number : ");
    number2 = sc.nextInt();

    System.out.print(" Please Enter Third Number : ");
    number3 = sc.nextInt();

    if((number1 > number2) && (number2 > number3))
    {
        System.out.println("\n Numbers decreasing  ");
    }
    else if ((number1 < number2) && (number2 < number3))
    {
        System.out.println("\n Numbers increasing  ");
    }
    else
    {
        System.out.println("\n Neither all are decreasing or increasing");
    }
}
}
