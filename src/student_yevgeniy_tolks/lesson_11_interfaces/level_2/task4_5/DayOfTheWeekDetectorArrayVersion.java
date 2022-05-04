package student_yevgeniy_tolks.lesson_11_interfaces.level_2.task4_5;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String dayOfTheWeek = null;
        String[] dayOfTheWeekArray = new String[8];
        dayOfTheWeekArray[0] = "Please input a valid number between 1 and 7";
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