package student_yevgeniy_tolks.lesson_6.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetector {

    public int getDateNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day number in range of 1 ot 7 :");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        String day = "";
        switch (dayNumber) {
            case 1 -> day = "Monday";
            case 2 -> day = "Tuesday";
            case 3 -> day = "Wednesday";
            case 4 -> day = "Thursday";
            case 5 -> day = "Friday";
            case 6 -> day = "Saturday";
            case 7 -> day = "Sunday";
            default -> System.out.println("Not correct number");
        }
        return day;
    }
}
