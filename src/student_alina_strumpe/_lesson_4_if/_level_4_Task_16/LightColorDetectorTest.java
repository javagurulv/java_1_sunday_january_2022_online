package student_alina_strumpe._lesson_4_if._level_4_Task_16;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetector lightColorDetector = new LightColorDetector();
        String color = lightColorDetector.detect(380);
        System.out.println(color);

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.lightColorTest1();
        lightColorDetectorTest.lightColorTest2();
        lightColorDetectorTest.lightColorTest3();
        lightColorDetectorTest.lightColorTest4();
        lightColorDetectorTest.lightColorTest5();
        lightColorDetectorTest.lightColorTest6();
        lightColorDetectorTest.lightColorTest7();
    }


    public void lightColorTest1() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLight = 381;
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(381);
        check(expectedResult, actualResult, "Violet");
    }


    public void lightColorTest2() {

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 451;
        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect(451);
        check(expectedResult, actualResult, "Blue");
    }


    public void lightColorTest3() {

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 496;
        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect(495);
        check(expectedResult, actualResult, "Green");
    }

    public void lightColorTest4() {

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 571;
        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect(570);
        check(expectedResult, actualResult, "Yellow");
    }


    public void lightColorTest5() {

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 591;
        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect(591);
        check(expectedResult, actualResult, "Orange");
    }


    public void lightColorTest6() {

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 621;
        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(621);
        check(expectedResult, actualResult, "Red");
    }


    public void lightColorTest7() {

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 0;
        String expectedResult = "Invisible light";
        String actualResult = lightColorDetector.detect(0);
        check(expectedResult, actualResult, "Invisible light");
   }



    public void check(String expectedResult, String actualResult, String name) {

        if (expectedResult == actualResult) {
            System.out.println("Test" + name + " is PASSED");
        } else {
            System.out.println("Test " + name + "FAILED");
            System.out.println("Expected " + expectedResult + " but actual: " + actualResult);

        }
    }
}














