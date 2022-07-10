package student_deniss_dubko.deniss_dubko_lesson_11_homework.level_2_intern.task_4_5;

class DayOfTheWeekDetectorArray implements DayOfTheWeekDetector {

    @Override
    public String detectDayOfTheWeek(int number) {
        String dayOfTheWeek = null;
        String[] dayOfTheWeekArray = new String[8];
        dayOfTheWeekArray[0] = "Enter day number: ";
        dayOfTheWeekArray[1] = "Monday";
        dayOfTheWeekArray[2] = "Tuesday";
        dayOfTheWeekArray[3] = "Wednesday";
        dayOfTheWeekArray[4] = "Thursday";
        dayOfTheWeekArray[5] = "Friday";
        dayOfTheWeekArray[6] = "Saturday";
        dayOfTheWeekArray[7] = "Sunday";
        for (int i = 0; i < dayOfTheWeekArray.length; i++) {
            if (number == i) {
                dayOfTheWeek = dayOfTheWeekArray[number];
                break;
            }
        }
        return dayOfTheWeek;
    }

}