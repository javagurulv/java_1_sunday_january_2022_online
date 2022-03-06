package student_elina_kucenko.lesson2.level1;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 1st double number");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("please enter 2nd double number");
        double secondDoubleNumber = scanner.nextDouble();

        double sum = firstDoubleNumber+secondDoubleNumber;
        double sub = firstDoubleNumber-secondDoubleNumber;
        double mul = firstDoubleNumber*secondDoubleNumber;
        double dev = firstDoubleNumber / secondDoubleNumber;

        System.out.println(firstDoubleNumber +"+"+ secondDoubleNumber +"=" + sum);
        System.out.println(firstDoubleNumber+"-"+ secondDoubleNumber +"=" + sub);
        System.out.println(firstDoubleNumber +"*"+ secondDoubleNumber +"=" + mul);
        System.out.println(firstDoubleNumber + "/" + secondDoubleNumber + "=" + dev);

    }
}
