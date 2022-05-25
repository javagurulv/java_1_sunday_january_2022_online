package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_7;

 class DayOfTheWeekDetectorTest {

    public  static void main(String[] args){

        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.shouldFindDayOfTheWeekTest1();
        dayOfTheWeekDetectorTest.shouldFindDayOfTheWeekTest2();
    }

    public void shouldFindDayOfTheWeekTest1(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
         String expectedResult = "Monday";
         String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(1);
        check(expectedResult, actualResult, "*Monday*");
    }

    public void shouldFindDayOfTheWeekTest2(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Not correct day number";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(9);
        check(expectedResult, actualResult, "*Not correct day number*");
    }

    public void check(String expectedResult, String actualResult, String name){

        if ( expectedResult == actualResult){
            System.out.println("Test Find Day of The Week "+name+" is OK");
        } else {
            System.out.println("Test Find Day of The Week "+name+" is Fail");
        }
    }



}
