package student_elina_kucenko.lesson4.task7;

class LeapYearTest {
    LeapYear leapYear = new LeapYear();

    public static void main(String[] args) {
        LeapYearTest leapYeartest = new LeapYearTest();
        leapYeartest.isLeapYearTest1(1999);
        leapYeartest.isLeapYearTest2(2004);
        leapYeartest.isLeapYearTest3(2000);
        leapYeartest.isLeapYearTest4(2100);

    }

    public void isLeapYearTest1(int year) {
        boolean result = false;
        if (leapYear.isLapYear(year) == result) {
            System.out.println("Year " + year + " is not divided by 4, so it is regular year - OK");
        } else System.out.println(year + " failed");
    }

    public void isLeapYearTest2(int year) {
        boolean result = true;
        if (leapYear.isLapYear(year) == result) {
            System.out.println("Year " + year + " is divided by 4, but not divided by 100, so it is leap year - OK");
        } else System.out.println(year + " failed");
    }

    public void isLeapYearTest3(int year) {
        boolean result = true;
        if (leapYear.isLapYear(year) == result) {
            System.out.println("Year " + year + " is divided by 4, by 100 and by 400, so it is leap year - OK");
        } else System.out.println(year + " failed");
    }

    public void isLeapYearTest4(int year) {
        boolean result = false;
        if (leapYear.isLapYear(year) == result) {
            System.out.println("Year " + year + " is divided by 4, by 100, but not divided by 400, so it regular year - OK");
        } else System.out.println(year + " failed");
    }

}




