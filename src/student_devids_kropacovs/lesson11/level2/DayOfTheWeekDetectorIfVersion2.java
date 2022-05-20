package student_devids_kropacovs.lesson11.level2;

class DayOfTheWeekDetectorIfVersion2 implements DayOfTheWeekDetector{

    // Try to use switch here!!
    public String detectDayName(int number) {

        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
        }
        return "Put a number from 1 to 7";
    }
}