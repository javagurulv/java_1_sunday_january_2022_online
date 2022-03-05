package student_aleksandrs_padalko.lesson_2.level_1;

//Напишите программу, которая запрашивает у пользователя целое число
//        и печатает на консоль таблицу умножения для этого числа до 10.

 //       Test Data:
 //       Input a number: 8

   //     Expected Output :
   //     8 x 1 = 8
    //    8 x 2 = 16
   //     8 x 3 = 24
   //     ...
   //     8 x 10 = 80


import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number:");
        int aNumber = scanner.nextInt();

        System.out.println(aNumber + " x 1 = " + aNumber);

        int sum2 = aNumber *2;
        System.out.println(aNumber + " x 2 = " +sum2);

        int sum3 = aNumber *3;
        System.out.println(aNumber + " x 3 = " +sum3);

        int sum4 = aNumber *4;
        System.out.println(aNumber + " x 4 = " +sum4);

        int sum5 = aNumber *5;
        System.out.println(aNumber + " x 5 = " +sum5);

        int sum6 = aNumber *6;
        System.out.println(aNumber + " x 6 = " +sum6);

        int sum7 = aNumber *7;
        System.out.println(aNumber + " x 7 = " +sum7);

        int sum8 = aNumber *8;
        System.out.println(aNumber + " x 8 = " +sum8);

        int sum9 = aNumber *9;
        System.out.println(aNumber + " x 9 = " +sum9);

        int sum10 = aNumber *10;
        System.out.println(aNumber + " x 10 = " +sum10);



    }
}
