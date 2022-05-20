package student_yevgeniy_tolks.lesson_13_exceptions.level_3.task19;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number : ");

        try {
            System.out.println("Entered number = " + scanner.nextInt());

        } catch (InputMismatchException e) {
            while (scanner.hasNextLine()) {
                if (scanner.hasNextInt()) {
                    System.out.println("Entered number = " + scanner.nextInt());
                    break;
                } else {
                    System.out.println("Wrong input entry, try whole number");
                    scanner.nextLine();
                }
            }
        }
    }
}

