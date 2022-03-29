package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_8;

import java.util.Scanner;

class DayOfTheWeekDetector2 {

    public int getDayNumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number from 1 to 7");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber){
        String dayString;
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
           //System.out.println(dayString);
        return dayString;
    }
    }

