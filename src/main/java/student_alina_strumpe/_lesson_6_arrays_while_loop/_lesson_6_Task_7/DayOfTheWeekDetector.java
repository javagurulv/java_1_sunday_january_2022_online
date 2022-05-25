package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_7;

import java.util.Scanner;

class DayOfTheWeekDetector {

    private String dayOfTheWeek;
    private String dayString;

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day number from 1 to 7");
        return scanner.nextInt();
        }

        public String findDayOfTheWeek(int dayNumber) {

        if (dayNumber == 1){
            return "Monday";
        } else if (dayNumber == 2){
            return "Tuesday";
        } else if (dayNumber == 3){
            return "Wednesday";
        } else if (dayNumber == 4){
            return "Thursday";
        } else if (dayNumber == 5){
            return "Friday";
        } else if (dayNumber == 6){
            return "Saturday";
        } else if (dayNumber == 7){
            return "Sunday";
        } else {
            return "Not correct day number";
        }
        }
    }

