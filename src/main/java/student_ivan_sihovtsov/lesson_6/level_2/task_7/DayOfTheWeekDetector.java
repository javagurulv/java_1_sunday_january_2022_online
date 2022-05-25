package student_ivan_sihovtsov.lesson_6.level_2.task_7;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        while (dayNumber == 1) {
            return ("Monday");
        }
        while (dayNumber == 2) {
            return ("Tuesday");
        }
        while (dayNumber == 3) {
            return ("Wednesday");
        }
        while (dayNumber == 4) {
            return ("Thursday");
        }
        while (dayNumber == 5) {
            return ("Friday");
        }
        while (dayNumber == 6) {
            return ("Saturday");
        }
        while (dayNumber == 7) {
            return ("Sunday");
        }

        return "Not correct day number";
    }

}

