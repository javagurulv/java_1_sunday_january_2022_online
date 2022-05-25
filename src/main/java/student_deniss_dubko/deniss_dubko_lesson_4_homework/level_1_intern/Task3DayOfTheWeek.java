package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_1_intern;

import java.util.Scanner;

class Task3DayOfTheWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number from 1 to 7: ");
        int numberOfWeekDay = scanner.nextInt();

        if (numberOfWeekDay == 1) {
            System.out.println("Monday");
            } else if (numberOfWeekDay == 2) {
            System.out.println("Tuesday");
            } else if (numberOfWeekDay == 3) {
            System.out.println("Wednesday");
            } else if (numberOfWeekDay == 4) {
            System.out.println("Thursday");
            } else if (numberOfWeekDay == 5) {
            System.out.println("Friday");
            } else if (numberOfWeekDay == 6) {
            System.out.println("Saturday");
            } else if (numberOfWeekDay == 7) {
            System.out.println("Sunday");
            } else {
            System.out.println("Your number is not from 1 to 7");
        }
    }


}
