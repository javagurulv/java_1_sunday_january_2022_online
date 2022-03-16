package student_vitaly_galuzo.lesson_4.level_5;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.bluetTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleTest();

    }


    public void violetTest(){

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 381;
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(waveLength);
        if(expectedResult == actualResult){
            System.out.println("TEST = PASSED!");
        }else{
            System.out.println("Test = FAILED!");
        }
        }
    public void bluetTest(){

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 451;
        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect(waveLength);
        if(expectedResult == actualResult){
            System.out.println("TEST = PASSED!");
        }else{
            System.out.println("Test = FAILED!");
        }
        }

    public void greenTest(){

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 501;
        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect(waveLength);
        if(expectedResult == actualResult){
            System.out.println("TEST = PASSED!");
        }else{
            System.out.println("Test = FAILED!");
        }
        }
    public void yellowTest(){

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 571;
        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect(waveLength);
        if(expectedResult == actualResult){
            System.out.println("TEST = PASSED!");
        }else{
            System.out.println("Test = FAILED!");
        }
        }
    public void orangeTest(){

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 591;
        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect(waveLength);
        if(expectedResult == actualResult){
            System.out.println("TEST = PASSED!");
        }else{
            System.out.println("Test = FAILED!");
        }
        }

    public void redTest(){

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 621;
        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(waveLength);
        if(expectedResult == actualResult){
            System.out.println("TEST = PASSED!");
        }else{
            System.out.println("Test = FAILED!");
        }
        }

    public void invisibleTest(){

        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 350;
        String expectedResult = "Invisible light";
        String actualResult = lightColorDetector.detect(waveLength);
        if(expectedResult == actualResult){
            System.out.println("TEST = PASSED!");
            System.out.println("Light is invisible!");
        }else{
            System.out.println("Test = FAILED!");
        }
        }


}





