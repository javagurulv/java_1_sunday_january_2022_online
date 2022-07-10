package student_deniss_dubko.deniss_dubko_lesson_11_homework.level_2_intern.task_4_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day number: ");
        int number = scanner.nextInt();
        while (number > 7 || number < 0) {
            System.out.println("Wrong number! Enter day number: ");
            number = scanner.nextInt();
        }
        String dayOfTheWeek = detector.detectDayOfTheWeek(number);
        System.out.println(dayOfTheWeek);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIf());
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitch());
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArray());
        dayOfTheWeekDetectorDemo.run();
        System.out.println("'If' completed!");
        dayOfTheWeekDetectorDemo1.run();
        System.out.println("'Switch' completed!");
        dayOfTheWeekDetectorDemo2.run();
        System.out.println("'Array' completed!");
    }

}