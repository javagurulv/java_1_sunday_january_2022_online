package student_alina_strumpe._lesson_4_if._level_7_Task_23;

public class LeapYearTest {

    public static void main(String[] args) {

        LeapYear leapYear = new LeapYear();
        boolean year = leapYear.isLeapYear(1999);


        LeapYearTest  leapYearTest = new LeapYearTest();
        leapYearTest.leapYearTest1();
        leapYearTest.leapYearTest2();

    }


    public void leapYearTest1() {
        LeapYear leap = new LeapYear();
        boolean expectedResult = true;
        boolean actualResult = leap.isLeapYear(2000);
        check(expectedResult, actualResult, "Leap year 1");
    }

    public void leapYearTest2(){
        LeapYear leapYear = new LeapYear();
        boolean expectedResult = false;
        boolean actualResult = leapYear.isLeapYear(1999);
        check(expectedResult,actualResult,"Leap year 2");
    }


    public void check(boolean expectedResult, boolean actualResult, String name) {
        if (expectedResult == actualResult) {
            System.out.println("TEST " + name + " has passed");
        } else {
            System.out.println("TEST " + name + " is failed");
            System.out.println("Expected: " + expectedResult + "but actual:" + actualResult);
        }
    }
}
