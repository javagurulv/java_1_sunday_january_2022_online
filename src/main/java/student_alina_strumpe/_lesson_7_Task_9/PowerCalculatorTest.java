package student_alina_strumpe._lesson_7_Task_9;

public class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest test = new PowerCalculatorTest();
        test.shouldCalculatePowerOfIntegers();
        test.shouldNotCalculatePowerOfIntegers();
        test.shouldCalculatePowerOfIntegers2();
    }
   /* public void shouldCalculatePowerOfIntegers(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 8;
        if (expectedResult == powerCalculator.powerOfNumbers(2,3)){
            System.out.println("OK");
        } else {
            System.out.println("\"FAIL\"");
        }
    }*/

    public void shouldCalculatePowerOfIntegers() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int actualResul = powerCalculator.powerOfNumbers(2, 3);
        check(8, actualResul, "Should calculate power ");
    }
    public void shouldCalculatePowerOfIntegers2() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int actualResul = powerCalculator.powerOfNumbers(0, 1);
        check(0, actualResul, "Should calculate power ");
    }
    public void shouldNotCalculatePowerOfIntegers() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int actualResult = powerCalculator.powerOfNumbers(2,3);
        check2(7,actualResult,"should NOT calculate power");
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test " + testName + " is OK");
        } else {
            System.out.println("\"Test " + testName + " is FAIL\"");
        }
    }

    public void check2(int expectedResult, int actualResult, String testName) {
        if (expectedResult != actualResult) {
            System.out.println("Test " + testName + " is OK");
        } else {
            System.out.println("\"Test " + testName + " is FAIL\"");
        }
    }
}


