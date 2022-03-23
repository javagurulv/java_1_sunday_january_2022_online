package student_sergei_klunkov.lesson_4.level_7;

class LeapYearTest {

    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.leapYear();
        leapYearTest.notLeapYear();

    }


    public void leapYear(){
        LeapYear leapYear = new LeapYear();
        int year = 2000;
        boolean expectedResult = true;
        boolean actualResult = leapYear.isLeapYear(year);
        if (expectedResult == actualResult) {
            System.out.println(year + " year is LEAP! " + " TEST OK! ");
        } else {
            System.out.println(year + " year is not LEAP! " + " TEST FAILED! ");
        }
    }

    public void notLeapYear(){
        LeapYear leapYear = new LeapYear();
        int year = 2001;
        boolean expectedResult = false;
        boolean actualResult = leapYear.isLeapYear(year);
        if (expectedResult == actualResult) {
            System.out.println(year + " year is not LEAP! " + " TEST OK! ");
        } else {
            System.out.println(year + " year is LEAP! " + " TEST FAILED! ");
        }
    }

}
