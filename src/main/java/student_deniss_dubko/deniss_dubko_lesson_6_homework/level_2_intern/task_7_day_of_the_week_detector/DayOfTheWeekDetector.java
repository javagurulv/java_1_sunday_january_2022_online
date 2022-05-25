package student_deniss_dubko.deniss_dubko_lesson_6_homework.level_2_intern.task_7_day_of_the_week_detector;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        String dayOfTheWeek = "";
        switch (dayNumber) {
            case 1:
                dayOfTheWeek = "Monday";
                break;
            case 2:
                dayOfTheWeek = "Tuesday";
                break;
            case 3:
                dayOfTheWeek = "Wednesday";
                break;
            case 4:
                dayOfTheWeek = "Thursday";
                break;
            case 5:
                dayOfTheWeek = "Friday";
                break;
            case 6:
                dayOfTheWeek = "Saturday";
                break;
            case 7:
                dayOfTheWeek = "Sunday";
                break;
            default:
                dayOfTheWeek = "Not correct day number";
                break;
        }
        return dayOfTheWeek;
    }

}