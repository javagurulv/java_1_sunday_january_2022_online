package student_sergei_klunkov.lesson_6.level_2;

import java.io.BufferedReader;
import java.util.Scanner;

class DayOfTheWeekDetector2 {

    public int getDayNumberFromUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {

        String dayString = "";

        switch (dayNumber) {
            case 1: dayString = "Monday";
            break;
            case 2: dayString = "Tuesday";
            break;
            case 3: dayString = "Wednesday";
            break;
            case 4: dayString = "Thursday";
            break;
            case 5: dayString = "Friday";
            break;
            case 6: dayString = "Saturday";
            break;
            case 7: dayString = "Sunday";
            break;
            default:  dayString = "Not correct day number";
            break;

        }
        return dayString;
    }
}
