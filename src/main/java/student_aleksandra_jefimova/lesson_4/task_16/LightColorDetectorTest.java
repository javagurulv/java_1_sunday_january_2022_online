package student_aleksandra_jefimova.lesson_4.task_16;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String color = lightColorDetector.detect (100);
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
        public void lightColorTest1 () {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLenght = 400;
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect (400);
        check (expectedResult, actualResult, "Violet");
        }
    public void lightColorTest2 () {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLenght = 451;
        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect (451);
        check (expectedResult, actualResult, "Blue");
    }
    public void lightColorTest3 () {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLenght = 500;
        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect (500);
        check (expectedResult, actualResult, "Green");
    }
    public void lightColorTest4 () {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLenght = 570;
        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect (570);
        check (expectedResult, actualResult, "Yellow");
    }
    public void lightColorTest5 () {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLenght = 590;
        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect (590);
        check (expectedResult, actualResult, "Orange");
    }
    public void lightColorTest6 () {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLenght = 620;
        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect (620);
        check (expectedResult, actualResult, "Red");
    }
    public void lightColorTest7 () {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLenght = 0;
        String expectedResult = "InvisibleLight";
        String actualResult = lightColorDetector.detect (0);
        check (expectedResult, actualResult, "InvisibleLight");
    }
    public void check (String expectedResult, String actualResult, String name) {
        if (expectedResult == actualResult) {
            System.out.println("Test" + name + " is OK");
        } else {
            System.out.println("Test " + name + " FAILED");
        }
    }
}
