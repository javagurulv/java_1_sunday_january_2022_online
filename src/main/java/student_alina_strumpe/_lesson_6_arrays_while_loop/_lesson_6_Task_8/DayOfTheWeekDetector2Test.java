package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_8;

public class DayOfTheWeekDetector2Test {

    public static void main(String[] args) {
        DayOfTheWeekDetector2Test dayOfTheWeekDetectorTest = new DayOfTheWeekDetector2Test();
        dayOfTheWeekDetectorTest.shouldReturnMonday();
        dayOfTheWeekDetectorTest.shouldReturnTuesday();
        dayOfTheWeekDetectorTest.shouldReturnWednesday();
        dayOfTheWeekDetectorTest.shouldReturnThursday();
        dayOfTheWeekDetectorTest.shouldReturnFriday();
        dayOfTheWeekDetectorTest.shouldReturnSaturday();
        dayOfTheWeekDetectorTest.shouldReturnSunday();
        dayOfTheWeekDetectorTest.shouldReturnNotCorrectNumber();
        dayOfTheWeekDetectorTest.shouldReturnNotCorrectDayNumber();
    }

    public void shouldReturnMonday() {
        DayOfTheWeekDetector2 detector2 = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector2.findDayOfTheWeek(1);
        check("Monday".equals(dayOfTheWeek), "Test Return Monday");
    }

        public void shouldReturnTuesday(){
            DayOfTheWeekDetector2 detector2 = new DayOfTheWeekDetector2();
            String dayOfTheWeek = detector2.findDayOfTheWeek(2);
            check("Tuesday".equals(dayOfTheWeek),"Test Return Tuesday");
        }

        public void shouldReturnWednesday(){
        DayOfTheWeekDetector2 detector2 = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector2.findDayOfTheWeek(3);
        check("Wednesday".equals(dayOfTheWeek),"Test Return Wednesday");
        }

        public void shouldReturnThursday(){
        DayOfTheWeekDetector2 detector2 = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector2.findDayOfTheWeek(4);
        check("Thursday".equals(dayOfTheWeek),"Test Return Thursday");
        }

        public void shouldReturnFriday(){
        DayOfTheWeekDetector2 detector2 = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector2.findDayOfTheWeek(5);
        check("Friday".equals(dayOfTheWeek),"Test Return Friday");
        }

        public void shouldReturnSaturday(){
        DayOfTheWeekDetector2 detector2 = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector2.findDayOfTheWeek(6);
        check("Saturday".equals(dayOfTheWeek),"Test Return Saturday");
        }

        public void shouldReturnSunday(){
        DayOfTheWeekDetector2 detector2 = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector2.findDayOfTheWeek(7);
        check("Sunday".equals(dayOfTheWeek),"Test Return Sunday");
        }

        public void shouldReturnNotCorrectNumber(){
        DayOfTheWeekDetector2 detector2 = new DayOfTheWeekDetector2();
        String dayOfTheWeek = detector2.findDayOfTheWeek(7);
        check("Not correct day number" != dayOfTheWeek,"Test Not Correct Number");
        }



    public void check(boolean condition,String testName) {
        if (condition) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is FAIL");
        }
    }
        public void shouldReturnNotCorrectDayNumber() {
            DayOfTheWeekDetector2 detector2 = new DayOfTheWeekDetector2();
            String expectedResult = "Not correct day number";
            String dayOfTheWeek = detector2.findDayOfTheWeek(7);
            if (expectedResult != dayOfTheWeek){
                System.out.println("Test Not Correct Number 2 is OK");
            } else {
                System.out.println("Test Not Correct Number 2 is FAIL");
            }
        }
}