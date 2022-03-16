package student_yevgeniy_tolks.lesson_6.level_2;

import java.util.Objects;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest weekDetectorTest = new DayOfTheWeekDetectorTest();
        weekDetectorTest.dayOfTheWeekMonday();
        weekDetectorTest.dayOfTheWeekTuesday();
        weekDetectorTest.dayOfTheWeekWednesday();
        weekDetectorTest.dayOfTheWeekThursday();
        weekDetectorTest.dayOfTheWeekFriday();
        weekDetectorTest.dayOfTheWeekSaturday();
        weekDetectorTest.dayOfTheWeekSunday();
        //weekDetectorTest.dayOfTheWeekNotExist();
    }

    public void testResult(Boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - Test Ok");
        } else {
            System.out.println(testName + " - Failed ");
        }
    }

    public void dayOfTheWeekMonday() {

        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String dayMonday = dayOfTheWeekDetector.findDayOfTheWeek(1);
        testResult(dayMonday.equals("Monday"), "Monday");

//        if (dayMonday == "Monday") {
//            System.out.println("This is Monday - Test OK!");
//        } else {
//            System.out.println("Not Monday - Test FAILED");
//        }
    }

    public void dayOfTheWeekTuesday() {

        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String dayTuesday = dayOfTheWeekDetector.findDayOfTheWeek(2);
        testResult(dayTuesday.equals("Tuesday"), "Tuesday");
    }

    public void dayOfTheWeekWednesday() {

        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String dayWednesday = dayOfTheWeekDetector.findDayOfTheWeek(3);
        testResult(dayWednesday.equals("Wednesday"), "Wednesday");
    }

    public void dayOfTheWeekThursday() {

        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String dayThursday = dayOfTheWeekDetector.findDayOfTheWeek(4);
        testResult(dayThursday.equals("Thursday"), "Thursday");
    }

    public void dayOfTheWeekFriday() {

        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String dayFriday = dayOfTheWeekDetector.findDayOfTheWeek(5);
        testResult(dayFriday.equals("Friday"), "Friday");
    }

    public void dayOfTheWeekSaturday() {

        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String daySaturday = dayOfTheWeekDetector.findDayOfTheWeek(6);
        testResult(daySaturday.equals("Saturday"), "Saturday");


    }

    public void dayOfTheWeekSunday() {

        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String daySunday = dayOfTheWeekDetector.findDayOfTheWeek(7);
        testResult(daySunday.equals("Sunday"), "Sunday");
    }
}
