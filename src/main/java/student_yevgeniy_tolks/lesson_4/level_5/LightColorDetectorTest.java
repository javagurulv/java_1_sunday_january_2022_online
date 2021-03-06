package student_yevgeniy_tolks.lesson_4.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();
        lightColorDetector.waveVioletTest();
        lightColorDetector.waveBlueTest();
        lightColorDetector.waveGreenTest();
        lightColorDetector.waveYellowTest();
        lightColorDetector.waveOrangeTest();
        lightColorDetector.waveRedTest();
        lightColorDetector.colorOutOfBoundary();
    }

    public void waveVioletTest() {
        int waveLenght = 445;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(waveLenght);
        if (waveColor.equals("Violet")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void waveBlueTest() {
        int waveLenght = 451;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(waveLenght);
        if (waveColor.equals("Blue")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void waveGreenTest() {
        int waveLenght = 500;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(waveLenght);
        if (waveColor.equals("Green")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void waveYellowTest() {
        int waveLenght = 575;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(waveLenght);
        if (waveColor.equals("Yellow")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void waveOrangeTest() {
        int waveLenght = 619;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(waveLenght);
        if (waveColor.equals("Orange")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void waveRedTest() {
        int waveLenght = 700;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(waveLenght);
        if (waveColor.equals("Red")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void colorOutOfBoundary() {
        int waveLenght = 379;

        LightColorDetector lightColorDetector = new LightColorDetector();
        String waveColor = lightColorDetector.detect(waveLenght);
        if (waveColor.equals("Invisible light")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }

    }

}


