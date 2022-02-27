package student_ivan_sihovtsov.lesson2.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {



        System.out.println("Please enter a radius: ");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();


        System.out.print("Perimeter is = ");
        System.out.println(2 * 3.14 * radius);

        System.out.print("Area is = ");
        System.out.println(3.14 * (radius * radius));


        System.out.println(" ");
        System.out.println("Have a nice day! ");



    }

}
