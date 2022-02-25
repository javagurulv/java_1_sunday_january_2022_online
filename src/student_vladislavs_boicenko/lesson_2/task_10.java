package student_vladislavs_boicenko.lesson_2;

import java.util.Scanner;

public class task_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double rad = scan.nextDouble();

        double resP = 2 * 3.14 * rad;
        double resS = 3.14 * rad * rad;
        System.out.println("Результат: ");
        System.out.println("Периметр круга: " + resP);
        System.out.println("Площадь круга: " + resS);
        System.out.println("Площадь круга: " + resS);

    }

}