package student_devids_kropacovs.lesson_4.level_5;

import java.util.Scanner;

public class LightColorDetectorDemo {
    public static void main(String[] args) {
        System.out.print("Please, enter a diapason number: ");
        Scanner s = new Scanner(System.in);
        int light = s.nextInt();
        LightColorDetector l = new LightColorDetector();
        String color = l.detect(light);
        System.out.println("The color will be " + color);
    }
}
