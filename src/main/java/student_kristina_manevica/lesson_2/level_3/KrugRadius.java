package student_kristina_manevica.lesson_2.level_3;

import java.util.Scanner;

public class KrugRadius {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Enter radius:");
        double radius = scanner.nextDouble();

        double pi = 3.14;
        int kvadrat = 2;
        double perimetr = pi * 2 * radius;
        double area = pi * Math.pow(radius, kvadrat) ;

        System.out.println ("Perimetr is: " + perimetr);
        System.out.println ("Area is: " + area);


    }


}
