package student_yevgeniy_tolks.lesson_6.level_2;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public int getDateNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day number in range of 1 ot 7 :");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        String day = "";
        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Day not found";
                break;
        }
        return day;
    }
}
