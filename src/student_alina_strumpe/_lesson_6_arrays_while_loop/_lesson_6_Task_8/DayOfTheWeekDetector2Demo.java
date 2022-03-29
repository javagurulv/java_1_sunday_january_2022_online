package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_8;

public class DayOfTheWeekDetector2Demo {

    public static void main(String[] args){
        DayOfTheWeekDetector2 detector2 = new DayOfTheWeekDetector2();
        int dayNumber = detector2.getDayNumberFromUser();
        String dayOfTheWeek = detector2.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);
    }
}
