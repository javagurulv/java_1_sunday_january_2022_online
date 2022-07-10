package student_deniss_dubko.deniss_dubko_lesson_11_homework.level_2_intern.task_4_5;

class DayOfTheWeekDetectorIf implements DayOfTheWeekDetector {

    public String detectDayOfTheWeek(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Enter number from 1 to 7";
        }
    }

}