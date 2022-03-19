package student_aleksandrs_padalko.lesson_4.level_2.task_7;

import java.util.Scanner;

class EqualsNumbers {
    public static void main(String[] args) {
        int number1, number2;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter the First Number : ");
        number1 = sc.nextInt();

        System.out.print(" Please Enter the Second Number : ");
        number2 = sc.nextInt();

        if(number1 != number2)
        {
            System.out.println("\n Numbers not equal ");
        }

        else
        {
            System.out.println("\n Both are Equal");
        }
    }
}


