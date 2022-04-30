package student_stanislav_astafjev.lesson_4.Task_16;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        new LightColorDetectorTest();
        violetTest();
        blueTest();
        greenTest();
        yellowTest();
        orangeTest();
        redTest();
        invisibleTest();
    }
    public static void violetTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 381;
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(waveLength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    }

    public static void blueTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 451;
        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect(waveLength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    }

    public static void greenTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 496;
        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect(waveLength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    }

    public static void yellowTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 571;
        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect(waveLength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    }

    public static void orangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 591;
        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect(waveLength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    }
    public static void redTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 621;
        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(waveLength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("TEST PASS");
        }
        else {
            System.out.println("TEST FAIL");
        }
    }
    public static void invisibleTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 351;
        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetector.detect(waveLength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("TEST PASS");
        }
        else {
            System.out.println("TEST FAIL");
        }
    }
}