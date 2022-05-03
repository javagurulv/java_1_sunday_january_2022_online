package student_yevgeniy_tolks.lesson_11_interfaces.level_2.task4;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number in range of 1 - 7 inclusively: ");
        int number = scanner.nextInt();
        while (number > 7 || number < 0) {
            System.out.println("Wrong number, repeat entry: ");
            number = scanner.nextInt();
        }
        String dayOfTheWeek = detector.detectDayName(number);
        System.out.println(dayOfTheWeek);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo
                (new DayOfTheWeekDetectorIfVersion());
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo1 = new DayOfTheWeekDetectorDemo
                (new DayOfTheWeekDetectorSwitchVersion());
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo2 = new DayOfTheWeekDetectorDemo
                (new DayOfTheWeekDetectorArrayVersion());
        dayOfTheWeekDetectorDemo.run();
        System.out.println("If algorithm implementation completed");
        dayOfTheWeekDetectorDemo1.run();
        System.out.println("Switch algorithm implementation completed");
        dayOfTheWeekDetectorDemo2.run();
        System.out.println("Array algorithm implementation completed");
    }
}
