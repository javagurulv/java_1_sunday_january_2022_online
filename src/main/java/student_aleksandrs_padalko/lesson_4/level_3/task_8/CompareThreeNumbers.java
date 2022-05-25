package student_aleksandrs_padalko.lesson_4.level_3.task_8;

import java.util.Scanner;

class CompareThreeNumbers { public static void main(String[] args) {
    int number1, number2, number3;
    Scanner sc = new Scanner(System.in);

    System.out.print(" Please Enter the First Number : ");
    number1 = sc.nextInt();

    System.out.print(" Please Enter the Second Number : ");
    number2 = sc.nextInt();

    System.out.print(" Please Enter Third Number : ");
    number3 = sc.nextInt();

    if((number1 != number2) && (number3 !=number1) && (number2 !=number3))
    {
        System.out.println("\n Numbers not equal  ");
    }
    else if ((number1 == number2) && (number3 == number1) && (number2 ==number3))
    {
        System.out.println("\n Numbers are equal  " + number2);
    }
    else
    {
        System.out.println("\n Neither all are equal or different");
    }
}
}

