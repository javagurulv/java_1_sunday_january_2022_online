package student_deniss_dubko.deniss_dubko_lesson_6_homework.level_2_intern.task_7_day_of_the_week_detector;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
    }

    public void shouldReturnMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResultForMonday("Monday".equals(dayOfTheWeek), "Monday");
    }

    private void checkTestResultForMonday(boolean isMonday, String testMonday) {
        if (isMonday) {
            System.out.println(testMonday + " = OK!");
        } else {
            System.out.println(testMonday + " = FAIL!");
        }
    }

    public void shouldReturnTuesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        checkTestResultForTuesday("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }

    private void checkTestResultForTuesday(boolean isTuesday, String testTuesday) {
        if (isTuesday) {
            System.out.println(testTuesday + " = OK!");
        } else {
            System.out.println(testTuesday + " = FAIL!");
        }
    }

    public void shouldReturnWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        checkTestResultForWednesday("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }

    private void checkTestResultForWednesday(boolean isWednesday, String testWednesday) {
        if (isWednesday) {
            System.out.println(testWednesday + " = OK!");
        } else {
            System.out.println(testWednesday + " = FAIL!");
        }
    }

    public void shouldReturnThursday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        checkTestResultForThursday("Thursday".equals(dayOfTheWeek), "Thursday");
    }

    private void checkTestResultForThursday(boolean isThursday, String testThursday) {
        if (isThursday) {
            System.out.println(testThursday + " = OK!");
        } else {
            System.out.println(testThursday + " = FAIL!");
        }
    }

    public void shouldReturnFriday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        checkTestResultForFriday("Friday".equals(dayOfTheWeek), "Friday");
    }

    private void checkTestResultForFriday(boolean isFriday, String testFriday) {
        if (isFriday) {
            System.out.println(testFriday + " = OK!");
        } else {
            System.out.println(testFriday + " = FAIL!");
        }
    }

    public void shouldReturnSaturday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        checkTestResultForSaturday("Saturday".equals(dayOfTheWeek), "Saturday");
    }

    private void checkTestResultForSaturday(boolean isSaturday, String testSaturday) {
        if (isSaturday) {
            System.out.println(testSaturday + " = OK!");
        } else {
            System.out.println(testSaturday + " = FAIL!");
        }
    }

    public void shouldReturnSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        checkTestResultForSunday("Sunday".equals(dayOfTheWeek), "Sunday");
    }

    private void checkTestResultForSunday(boolean isSunday, String testSunday) {
        if (isSunday) {
            System.out.println(testSunday + " = OK!");
        } else {
            System.out.println(testSunday + " = FAIL!");
        }
    }

}