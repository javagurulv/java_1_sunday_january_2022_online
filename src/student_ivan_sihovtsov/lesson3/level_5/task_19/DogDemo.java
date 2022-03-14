package student_ivan_sihovtsov.lesson3.level_5.task_19;

import java.util.Scanner;

public class DogDemo {

    public static void main(String[] args) {
        Dog belka = new Dog("Belka");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dog's age : ");
        int dogAge = scanner.nextInt();

        belka.voice();

        System.out.println(" is " + dogAge + " years old.");




    }

}
