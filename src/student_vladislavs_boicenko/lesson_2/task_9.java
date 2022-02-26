package student_vladislavs_boicenko.lesson_2;

import java.util.Scanner;

public class task_9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();

        int res1 = num * 2;
        int res2 = num * 3;
        int res3 = num * 4;
        int res4 = num * 5;
        int res5 = num * 6;
        int res6 = num * 7;
        int res7 = num * 8;
        int res8 = num * 9;
        int res9 = num * 10;

        System.out.println("Результат: ");
        System.out.println(num + "*" + 1 + "=" + num);
        System.out.println(num + "*" + 2 + "=" + res1);
        System.out.println(num + "*" + 3 + "=" + res2);
        System.out.println(num + "*" + 4 + "=" + res3);
        System.out.println(num + "*" + 5 + "=" + res4);
        System.out.println(num + "*" + 6 + "=" + res5);
        System.out.println(num + "*" + 7 + "=" + res6);
        System.out.println(num + "*" + 8 + "=" + res7);
        System.out.println(num + "*" + 9 + "=" + res8);
        System.out.println(num + "*" + 10 + "=" + res9);

    }
}
