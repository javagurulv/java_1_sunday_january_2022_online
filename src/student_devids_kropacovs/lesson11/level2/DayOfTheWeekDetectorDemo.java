package student_devids_kropacovs.lesson11.level2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    private DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector){
        this.detector=detector;
    }

    void run(){
        System.out.println("Please, enter a number from 1 - 7");
        Scanner scanner = new Scanner(System.in);
        int dayOfTheWeek = scanner.nextInt();
        String day =detector.detectDayName(dayOfTheWeek);
        System.out.println("Day is " + day);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion2());
        dayOfTheWeekDetectorDemo.run();
        dayOfTheWeekDetectorDemo1.run();

    }
}
