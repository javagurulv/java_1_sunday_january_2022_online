package student_deniss_dubko.deniss_dubko_lesson_4_homework.level_5_middle.task_16;

import java.util.Scanner;

class LightColorDetectorDemo {

    public static void main(String[] args) {

        LightColorDetector detector = new LightColorDetector();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter wave length: ");
        int waveLength = scanner.nextInt();

        System.out.println("Light color of the wave is: " + detector.detect(waveLength));
    }


}
