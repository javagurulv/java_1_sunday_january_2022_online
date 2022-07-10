package student_deniss_dubko.deniss_dubko_lesson_11_homework.level_2_intern.task_4_5;

class DayOfTheWeekDetectorSwitch implements DayOfTheWeekDetector {

    @Override
    public String detectDayOfTheWeek(int number) {

        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Enter number from 1 to 7: ";
        }
    }

}