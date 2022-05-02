package student_stanislav_astafjev.lesson_4.Task_23;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest LeapYearTest = new LeapYearTest();
        shouldBeRegularYearIfNotDevidedBy4();
        shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100();
        shouldBeLeapYearIfDevidedBy4AndDevidedBy100AndDevidedBy400();
        shouldBeRegularYearIfDevidedBy4AndDevidedBy100AndNotDividedBt400();
    }

    public static void shouldBeRegularYearIfNotDevidedBy4() {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(2),"shouldBeRegularYearIfNotDevidedBy4");
    }
    public static void shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100() {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(80),"shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100");
    }
    public static void shouldBeLeapYearIfDevidedBy4AndDevidedBy100AndDevidedBy400() {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(400), "shouldBeLeapYearIfDevidedBy4AndDevidedBy100AndDevidedBy400");
    }
    public static void shouldBeRegularYearIfDevidedBy4AndDevidedBy100AndNotDividedBt400() {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(500),"shouldBeRegularYearIfDevidedBy4AndDevidedBy100AndNotDividedBt400");
    }

    private static void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

}
