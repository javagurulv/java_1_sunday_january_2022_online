package student_elina_kucenko.lesson2.level3;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();

        for (int i = 1; i <=10 ; i++) {
            int table = number*i;
            System.out.println(number + " x " + i + " = " + table);

        }



    }
}
