package student_alina_strumpe._lesson_2_level_2_junior_Task10;

import java.util.Scanner;

public class CircleRad {
     public static void main(String[] args){

         Circle circle = new Circle();
         Scanner scan = new Scanner(System.in);
         System.out.println("Insert circle radius: ");
         float circleRadius = scan.nextFloat();



         float Per = (float)(2 * Math.PI * circleRadius);
         float Area = (float)(Math.PI * circleRadius * circleRadius);



         System.out.println("Circle Perimeter is " + Per);
         System.out.println("Circle Area is " + Area);
         scan.close();
     }
}
