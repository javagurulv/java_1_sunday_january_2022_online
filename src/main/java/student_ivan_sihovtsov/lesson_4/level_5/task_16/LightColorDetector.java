package student_ivan_sihovtsov.lesson_4.level_5.task_16;

import java.util.Scanner;

public class LightColorDetector {

    public static void main(String[] args) {

        System.out.print("Enter wavelength: ");
        Scanner scanner = new Scanner(System.in);
        int wavelength = scanner.nextInt();

        LightColor lightColor = new LightColor();
        String color = lightColor.detect(wavelength);

        System.out.println("Color is " + color);


    }

}
