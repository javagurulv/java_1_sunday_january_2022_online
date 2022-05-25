package student_sergei_klunkov.lesson_2.level_3;

import java.util.Scanner;

class Circle {

    public static void main(String[] args) {

        // Запрашиваем у пользователя радиус(r) круга - вещественное число
        Scanner sc;
        sc = new Scanner ( System.in );
        System.out.println("Введите радиус круга и получите его периметр и площадь");
        System.out.println("r = ");

        // Выводим на консоль Площадь и Периметр

        double radius = sc.nextDouble();

        double area = Math.PI * (radius * radius);

        System.out.println("Площадь круга равна: " + area);

        double perimeter = Math.PI * 2*radius;
        System.out.println("Периметр равен: "+ perimeter);











   }

}
