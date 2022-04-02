package student_sergei_klunkov.lesson_6.level_2;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();

        dayOfTheWeekDetectorTest.mondayTest();
        dayOfTheWeekDetectorTest.tuesdayTest();
        dayOfTheWeekDetectorTest.wednesdayTest();
        dayOfTheWeekDetectorTest.thursdayTest();
        dayOfTheWeekDetectorTest.fridayTest();
        dayOfTheWeekDetectorTest.saturdayTest();
        dayOfTheWeekDetectorTest.sundayTest();
        dayOfTheWeekDetectorTest.notCorrectDayNumber();



    }

    public void mondayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        String expectedResult = "Monday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(1);
        check(expectedResult, actualResult, "Monday");
    }
    public void tuesdayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        String expectedResult = "Tuesday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(2);
        check(expectedResult, actualResult, "Tuesday");
    }

    public void wednesdayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        String expectedResult = "Wednesday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(3);
        check(expectedResult, actualResult, "Wednesday");

    }

    public void thursdayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        String expectedResult = "Thursday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(4);
        check(expectedResult, actualResult, "Thursday");

    }

    public void fridayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        String expectedResult = "Friday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(5);
        check(expectedResult, actualResult, "Friday");

    }

    public void saturdayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        String expectedResult = "Saturday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(6);
        check(expectedResult, actualResult, "Saturday");

    }

    public void sundayTest(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        String expectedResult = "Sunday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(7);
        check(expectedResult, actualResult, "Sunday");

    }

    public void notCorrectDayNumber(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        String expectedResult = "Not correct day number";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(8);
        check(expectedResult, actualResult, "Not correct day number");

    }

    public void check(String expectedResult, String actualResult, String name) {

        if (expectedResult == actualResult) {
            System.out.println(" Test " + name + " has passed! ");
        } else {
            System.out.println(" Test " + name + " failed! ");
            System.out.println("Expected: " + expectedResult + " but actual " + actualResult);
        }
    }
}