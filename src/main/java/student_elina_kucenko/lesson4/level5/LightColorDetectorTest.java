package student_elina_kucenko.lesson4.level5;

class LightColorDetectorTest {

    private LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.testVioletColor(400);
        lightColorDetectorTest.testBlueColor(470);
        lightColorDetectorTest.testGreenColor(550);
        lightColorDetectorTest.testYellowColor(580);
        lightColorDetectorTest.testOrangeColor(610);
        lightColorDetectorTest.testRedColor(650);
        lightColorDetectorTest.testInvisibleLight(100);

    }

    public void testVioletColor(int waveLength) {
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Violet")) {
            System.out.println("Violet wave length OK");
        } else {
            System.out.println("Violet wave length Failed");
        }
    }

    public void testBlueColor(int waveLength) {
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Blue")) {
            System.out.println("Blue wave length OK");
        } else {
            System.out.println("Blue wave length Failed");
        }
    }

    public void testGreenColor(int waveLength) {
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Green")) {
            System.out.println("Green wave length OK");
        } else {
            System.out.println("Green wave length Failed");
        }
    }

    public void testYellowColor(int waveLength) {
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Yellow")) {
            System.out.println("Yellow wave length OK");
        } else {
            System.out.println("Yellow wave length Failed");
        }
    }

    public void testOrangeColor(int waveLength) {
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Orange")) {
            System.out.println("Orange wave length OK");
        } else {
            System.out.println("Orange wave length Failed");
        }
    }

    public void testRedColor(int waveLength) {
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Red")) {
            System.out.println("Red wave length OK");
        } else {
            System.out.println("Red wave length Failed");
        }
    }

    public void testInvisibleLight(int waveLength) {
        String result = lightColorDetector.detect(waveLength);
        if (result.equals("Invisible light")) {
            System.out.println("Invisible light OK");
        } else {
            System.out.println("Invisible light Failed");
        }
    }
}




