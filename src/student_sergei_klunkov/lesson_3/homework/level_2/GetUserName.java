package student_sergei_klunkov.lesson_3.homework.level_2;

import java.util.Scanner;

class GetUserName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Tell your name: ");

        String userName = scanner.next();

        System.out.print("Hello, "+ userName + "!");

    }

}
