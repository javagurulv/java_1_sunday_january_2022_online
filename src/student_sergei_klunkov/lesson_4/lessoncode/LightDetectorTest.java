package student_sergei_klunkov.lesson_4.lessoncode;

class LightDetectorTest {

    public static void main(String[] args) {
        LightDetectorTest testRunner = new LightDetectorTest();
        testRunner.testRedColor();

    }

    public void testRedColor(){
        LightDetector subject = new LightDetector();
        int waveLenght = 450;

        String expectedResult = "Red";
        String actualResult = subject.detect(waveLenght);
        if (expectedResult == actualResult){
            System.out.println("Test has passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected: " + expectedResult + " but actual " + actualResult);

    }



}

}
