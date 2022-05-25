package student_sergei_klunkov.lesson_11.level_2.task_4_task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo  {

    DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please, type the number from 1 to 7 ... ");
        int number = scanner.nextInt();
        while (number > 7 || number < 0) {
            System.out.println(" Wrong number, choose number from 1 to 7 ... ");
            number = scanner.nextInt();
        }
        String dayOfTheWeek = detector.detectDayName(number);
        System.out.println(dayOfTheWeek);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorVersionSwitch());
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        dayOfTheWeekDetectorDemo.run();
        dayOfTheWeekDetectorDemo1.run();
    }
}
