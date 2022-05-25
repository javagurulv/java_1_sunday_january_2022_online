package student_vitaly_galuzo.lesson_6.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        String dayOfWeek = "";
        switch (dayNumber) {
            case 1 -> dayOfWeek = ("Monday");
            case 2 -> dayOfWeek = ("Tuesday");
            case 3 -> dayOfWeek = ("Wednesday");
            case 4 -> dayOfWeek = ("Thursday");
            case 5 -> dayOfWeek = ("Friday");
            case 6 -> dayOfWeek = ("Saturday");
            case 7 -> dayOfWeek = ("Sunday");
            default -> dayOfWeek = ("Not correct day");
        }
        return dayOfWeek;
    }
}