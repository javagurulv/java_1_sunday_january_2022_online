package student_sergei_klunkov.lesson_11.level_2.task_4_task_5;

class DayOfTheWeekDetectorVersionSwitch implements DayOfTheWeekDetector {


    @Override
    public String detectDayName(int number) {
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
                return "Type the number from 1 to 7!";
        }
    }
}
