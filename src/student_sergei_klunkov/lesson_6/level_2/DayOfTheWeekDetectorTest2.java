package student_sergei_klunkov.lesson_6.level_2;

class DayOfTheWeekDetectorTest2 {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest2 detector = new DayOfTheWeekDetectorTest2();
        detector.shouldReturnMonday();
        detector.shouldReturnTuesday();
        detector.shouldReturnWednesday();
        detector.shouldReturnThursday();
        detector.shouldReturnFriday();
        detector.shouldReturnSaturday();
        detector.shouldReturnSunday();
        detector.shouldReturnNotCorrectDayOfTheWeek();



    }

    public void shouldReturnMonday() {
        DayOfTheWeekDetector2 detector = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }

    public void shouldReturnTuesday() {
        DayOfTheWeekDetector2 detector = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }

    public void shouldReturnWednesday() {
        DayOfTheWeekDetector2 detector = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }

    public void shouldReturnThursday() {
        DayOfTheWeekDetector2 detector = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
    }

    public void shouldReturnFriday() {
        DayOfTheWeekDetector2 detector = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }

    public void shouldReturnSaturday() {
        DayOfTheWeekDetector2 detector = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }

    public void shouldReturnSunday() {
        DayOfTheWeekDetector2 detector = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }

    public void shouldReturnNotCorrectDayOfTheWeek() {
        DayOfTheWeekDetector2 detector = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector.findDayOfTheWeek(8);
        checkTestResult("NotCorrectDayOfTheWeek" != dayOfTheWeek, "NotCorrectDayOfTheWeek");
    }


    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}
