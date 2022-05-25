package student_devids_kropacovs.lesson4.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest l = new LightColorDetectorTest();
        l.violetTest();
        l.blueTest();
        l.greenTest();
        l.yellowTest();
        l.orangeTest();
        l.redTest();
        l.invisibleTest();
    }

    public void violetTest() {
        int light = 380;
        String expectedResult = "Violet";
        LightColorDetector l = new LightColorDetector();
        String actualResult = l.detect(light);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Violet Test Pass");
        } else {
            System.out.println("Violet Test Fail");
        }
    }

    public void blueTest() {
        int light = 450;
        String expectedResult = "Blue";
        LightColorDetector l = new LightColorDetector();
        String actualResult = l.detect(light);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Blue Test Pass");
        } else {
            System.out.println("Blue Test Fail");
        }
    }

    public void greenTest() {
        int light = 495;
        String expectedResult = "Green";
        LightColorDetector l = new LightColorDetector();
        String actualResult = l.detect(light);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Green Test Pass");
        } else {
            System.out.println("Green Test Fail");
        }
    }

    public void yellowTest() {
        int light = 570;
        String expectedResult = "Yellow";
        LightColorDetector l = new LightColorDetector();
        String actualResult = l.detect(light);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Yellow Test Pass");
        } else {
            System.out.println("Yellow Test Fail");
        }
    }

    public void orangeTest() {
        int light = 590;
        String expectedResult = "Orange";
        LightColorDetector l = new LightColorDetector();
        String actualResult = l.detect(light);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Orange Test Pass");
        } else {
            System.out.println("Orange Test Fail");
        }
    }

    public void redTest() {
        int light = 620;
        String expectedResult = "Red";
        LightColorDetector l = new LightColorDetector();
        String actualResult = l.detect(light);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Red Test Pass");
        } else {
            System.out.println("Red Test Fail");
        }
    }

    public void invisibleTest() {
        int light = 751;
        String expectedResult = "Invisible light";
        LightColorDetector l = new LightColorDetector();
        String actualResult = l.detect(light);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Invisible Test Pass");
        } else {
            System.out.println("Invisible Test Fail");
        }
    }
}
