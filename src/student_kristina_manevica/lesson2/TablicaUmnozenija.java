package student_kristina_manevica.lesson2;

import java.util.Scanner;

public class TablicaUmnozenija {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        int one = number * 1;
        int two = number * 2;
        int three = number * 3;
        int four = number * 4;
        int five = number * 5;
        int six = number * 6;
        int seven = number * 7;
        int eight = number * 8;
        int nine = number * 9;
        int ten = number * 10;

        System.out.println(number + " x " + "1 " + "= " + one);
        System.out.println(number + " x " + "2 " + "= " + two);
        System.out.println(number + " x " + "3 " + "= " + three);
        System.out.println(number + " x " + "4 " + "= " + four);
        System.out.println(number + " x " + "5 " + "= " + five);
        System.out.println(number + " x " + "6 " + "= " + six);
        System.out.println(number + " x " + "7 " + "= " + seven);
        System.out.println(number + " x " + "8 " + "= " + eight);
        System.out.println(number + " x " + "9 " + "= " + nine);
        System.out.println(number + " x " + "10 " + "= " + ten);

    }
}
