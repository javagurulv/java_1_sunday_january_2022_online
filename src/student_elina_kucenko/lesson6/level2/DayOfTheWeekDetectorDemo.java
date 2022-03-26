package student_elina_kucenko.lesson6.level2;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        int dayNumber = dayOfTheWeekDetector.getDayNumberFromUser();
        System.out.println(dayOfTheWeekDetector.findDayOfTheWeek(dayNumber));
    }
}

