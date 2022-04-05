package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_3_junior;

import java.util.Scanner;

class Task9IncreasingOrDecreasingNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integer numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
                System.out.println("Increasing");
            } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
                System.out.println("Decreasing");
            } else {
                System.out.println("Neither increasing or decreasing order");
        }
    }


}
