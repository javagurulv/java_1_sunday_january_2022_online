package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_7;

 class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {

        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);



       /* String dayString;
        switch (dayNumber){
            case 1: dayString = "Monday";
            break;
            case 2: dayString = "Tuesday";
            break;
            case 3: dayString = "Wednesday";
            break;
            case 4: dayString = "Thursday";
            break;
            case 5: dayString = "Friday";
            break;
            case 6: dayString = "Saturday";
            break;
            case 7: dayString = "Sunday";
            break;
            default: dayString = "Not correct day number";
            break;
        }
        System.out.println(dayString);
    }*/


    }
}
