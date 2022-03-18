package student_yevgeniy_tolks.lesson_6.level_2;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {

        DayOfTheWeekDetector dayDetector = new DayOfTheWeekDetector();
        int dayNumber = dayDetector.getDateNumberFromUser();
        String dayOFTheWeek = dayDetector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOFTheWeek);
    }
}
