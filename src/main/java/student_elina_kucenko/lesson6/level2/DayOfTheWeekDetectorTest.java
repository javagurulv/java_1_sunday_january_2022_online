package student_elina_kucenko.lesson6.level2;

class DayOfTheWeekDetectorTest {
    DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.testShouldReturnMonday();
        dayOfTheWeekDetectorTest.testShouldReturnTuesday();
        dayOfTheWeekDetectorTest.testShouldReturnWednesday();
        dayOfTheWeekDetectorTest.testShouldReturnThursday();
        dayOfTheWeekDetectorTest.testShouldReturnFriday();
        dayOfTheWeekDetectorTest.testShouldReturnSaturday();
        dayOfTheWeekDetectorTest.testShouldReturnSunday();
        dayOfTheWeekDetectorTest.testShouldReturnWrongInput();

    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    public void testShouldReturnMonday() {
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");

    }

    public void testShouldReturnTuesday() {
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }

    public void testShouldReturnWednesday() {
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }

    public void testShouldReturnThursday() {
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
    }

    public void testShouldReturnFriday() {
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }

    public void testShouldReturnSaturday() {
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }

    public void testShouldReturnSunday() {
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }

    public void testShouldReturnWrongInput() {
        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(8);
        checkTestResult("Not correct day number".equals(dayOfTheWeek), "Not correct day number");
    }
}
