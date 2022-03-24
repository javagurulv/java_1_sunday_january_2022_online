package student_vitaly_galuzo.lesson_6;

public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();

        numberUtilsTest.IsEvenNumberTest();



    }

    public void IsEvenNumberTest() {
        NumberUtils numberUtils = new NumberUtils();

        int number = 10;
        boolean expectedResult = true;
        boolean actualResult = numberUtils.isEven(number);
        if (actualResult == expectedResult) {
            System.out.println("TEST = PASSED!");
        } else {
            System.out.println("TEST = FAILED!");
        }

    }

}
