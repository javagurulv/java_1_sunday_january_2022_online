package student_yevgeniy_tolks.lesson_11_interfaces.level_2.task4;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.dayOfTheWeekDetectorIfImplTest();
        test.dayOfTheWeekDetectorSwitchImplTest();
        test.dayOfTheWeekDetectorArrayImplTest();
    }

    public void dayOfTheWeekDetectorIfImplTest() {
        int number = 2;
        String expectedDayOfTheWeek = "Tuesday";

        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion =
                new DayOfTheWeekDetectorIfVersion();
        String resultDayOfTheWeek = dayOfTheWeekDetectorIfVersion.detectDayName(number);
        equalityOfTwoObjects(expectedDayOfTheWeek, resultDayOfTheWeek);
    }

    public void dayOfTheWeekDetectorSwitchImplTest() {
        int number = 3;
        String expectedDayOfTheWeek = "Wednesday";

        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion =
                new DayOfTheWeekDetectorSwitchVersion();
        String resultDayOfTheWeek = dayOfTheWeekDetectorSwitchVersion.detectDayName(number);
        equalityOfTwoObjects(expectedDayOfTheWeek, resultDayOfTheWeek);

    }

    public void dayOfTheWeekDetectorArrayImplTest() {
        int number = 5;
        String expectedDayOfTheWeek = "Friday";

        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion
                = new DayOfTheWeekDetectorArrayVersion();
        String resultDayOfTheWeek = dayOfTheWeekDetectorArrayVersion.detectDayName(number);
        equalityOfTwoObjects(expectedDayOfTheWeek, resultDayOfTheWeek);
    }

    public void equalityOfTwoObjects(String result, String expect) {
        if (expect.equals(result)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
    }

}
