package student_stanislav_astafjev.lesson_4.Task_16;

public class LightColorDetectorTest {
    private LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {
        new LightColorDetectorTest();
        violetTest(405);
        blueTest(475);
        greenTest(505);
        yellowTest(585);
        orangeTest(619);
        redTest(620);
        invisibleTest(760);
    }
    public static void violetTest(int waveLength) {
        String result = LightColorDetector.detect(waveLength);
        checkResult(result.equals("Violet"),"LightColorDetector test - Violet");
    }

    public static void blueTest(int waveLength) {
        String result = LightColorDetector.detect(waveLength);
        checkResult(result.equals("Blue"),"LightColorDetector test - Blue");
    }

    public static void greenTest(int waveLength) {
        String result = LightColorDetector.detect(waveLength);
        checkResult(result.equals("Green"),"LightColorDetector test - Green");
    }

    public static void yellowTest(int waveLength) {
        String result = LightColorDetector.detect(waveLength);
        checkResult(result.equals("Yellow"),"LightColorDetector test - Yellow");
    }

    public static void orangeTest(int waveLength) {
        String result = LightColorDetector.detect(waveLength);
        checkResult(result.equals("Orange"),"LightColorDetector test - Orange");

    }
    public static void redTest(int waveLength) {
        String result = LightColorDetector.detect(waveLength);
        checkResult(result.equals("Red"),"LightColorDetector test - Red");
    }
    public static void invisibleTest(int waveLength) {
        String result = LightColorDetector.detect(waveLength);
        checkResult(result.equals("Invisible Light"),"LightColorDetector test - Invisible light");
    }
    private static void checkResult(boolean condition, String testName) {
        if (condition){
            System.out.println(testName + "  = OK ");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}