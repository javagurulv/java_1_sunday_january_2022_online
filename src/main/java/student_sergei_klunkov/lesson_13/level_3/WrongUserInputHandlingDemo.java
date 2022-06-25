package student_sergei_klunkov.lesson_13.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number: ");
        while (scanner.hasNextLine()) {
            try {
                scanner.nextInt();
                break;
            } catch (InputMismatchException exception) {
                System.out.println(" Wrong symbols, enter number! ");
            }
            scanner.nextLine();
        }
    }
}
