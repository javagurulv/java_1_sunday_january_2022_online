package student_ivan_sihovtsov.lesson_6.level_2.task_7;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.monday();
        dayOfTheWeekDetectorTest.tuesday();
        dayOfTheWeekDetectorTest.wednesday();
        dayOfTheWeekDetectorTest.thursday();
        dayOfTheWeekDetectorTest.friday();
        dayOfTheWeekDetectorTest.saturday();
        dayOfTheWeekDetectorTest.sunday();
        dayOfTheWeekDetectorTest.nonExistentDay();
    }
    public void monday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        // Сравнить стринг, monday он или нет
        if("Monday".equals(dayOfTheWeek)){
            System.out.println("Test Monday is ok");
        }else System.out.println("Test Monday is fail");
    }
    public void tuesday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        if("Tuesday".equals(dayOfTheWeek)){
            System.out.println("Test Tuesday is ok");
        }else System.out.println("Test Tuesday is fail");
    }
    public void wednesday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        if("Wednesday".equals(dayOfTheWeek)){
            System.out.println("Test Wednesday is ok");
        }else System.out.println("Test Wednesday is fail");
    }
    public void thursday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        if("Thursday".equals(dayOfTheWeek)){
            System.out.println("Test Thursday is ok");
        }else System.out.println("Test Thursday is fail");
    }
    public void friday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        if("Friday".equals(dayOfTheWeek)){
            System.out.println("Test Friday is ok");
        }else System.out.println("Test Friday is fail");
    }
    public void saturday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        if("Saturday".equals(dayOfTheWeek)){
            System.out.println("Test Saturday is ok");
        }else System.out.println("Test Saturday is fail");
    }
    public void sunday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        if("Sunday".equals(dayOfTheWeek)){
            System.out.println("Test Sunday is ok");
        }else System.out.println("Test Sunday is fail");
    }
    public void nonExistentDay(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(10);
        if("Not correct day number".equals(dayOfTheWeek)){
            System.out.println("Test Non-existent day is ok");
        }else System.out.println("Test Non-existent day is fail");
    }

}
