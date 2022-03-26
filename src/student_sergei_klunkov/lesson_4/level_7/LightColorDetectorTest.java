package student_sergei_klunkov.lesson_4.level_7;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }
    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, " Violet ");
    }
    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, " Blue ");
    }
    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, " Green ");
    }
    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, " Yellow ");
    }
    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, " Orange ");
    }
    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, " Red ");

    }
    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetector.detect(wavelength);
        check(expectedResult, actualResult, " Invisible Light ");
    }

    public void check(String expectedResult, String actualResult, String name){

        if(actualResult == expectedResult) {
            System.out.println("LightColorDetectorTest" + name + " has passed! ");
        } else {
            System.out.println("LightColorDetectorTest" + name + " has failed! ");
        }

    }
}
