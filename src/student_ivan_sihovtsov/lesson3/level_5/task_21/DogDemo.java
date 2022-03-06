package student_ivan_sihovtsov.lesson3.level_5.task_21;

import java.util.Scanner;

public class DogDemo {

    public static void main(String[] args) {

        Dog belka = new Dog("Belka", 12);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        belka.voice();
        System.out.print(color + ".");


    }

}
