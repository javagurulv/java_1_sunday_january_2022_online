package student_vladislavs_boicenko.lesson_2;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        double rad = scan.nextDouble();

        double resP = 2 * 3.14 * rad;
        double resS = 3.14 * rad * rad;
        System.out.println("Circle perimeter: " + resP);
        System.out.println("Circle area: " + resS);

    }
}