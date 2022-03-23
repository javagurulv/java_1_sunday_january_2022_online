package student_sergei_klunkov.lesson_4.level_5;


class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest testRunner = new LightColorDetectorTest();
        testRunner.testVioletColor();
        testRunner.testBlueColor();
        testRunner.testGreenColor();
        testRunner.testYellowColor();
        testRunner.testOrangeColor();
        testRunner.testRedColor();
        testRunner.testInvisibleLight();
    }


    public void testVioletColor(){
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 420;
        String expectedResult = "Violet";
        String actualResult = subject.detect(waveLength);
        System.out.println("Test Violet Color - OK!");
    }

    public void testBlueColor(){
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 470;
        String expectedResult = "Blue";
        String actualResult = subject.detect(waveLength);
        System.out.println("Test Blue Color - OK!");
    }

    public void testGreenColor(){
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 498;
        String expectedResult = "Green";
        String actualResult = subject.detect(waveLength);
        System.out.println("Test Green Color - OK!");
    }

    public void testYellowColor(){
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 575;
        String expectedResult = "Yellow";
        String actualResult = subject.detect(waveLength);
        System.out.println("Test Yellow Color - OK!");
    }

    public void testOrangeColor(){
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 600;
        String expectedResult = "Orange";
        String actualResult = subject.detect(waveLength);
        System.out.println("Test Orange Color - OK!");
    }

    public void testRedColor(){
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 625;
        String expectedResult = "Red";
        String actualResult = subject.detect(waveLength);
        System.out.println("Test Red Color - OK!");
    }

    public void testInvisibleLight(){
        LightColorDetector subject = new LightColorDetector();
        int waveLength = 300;
        String expectedResult = "Invisible light";
        String actualResult = subject.detect(waveLength);
        System.out.println("Test Invisible Light - OK!");
    }

}
