package student_yevgeniy_tolks.lesson_7.level_5;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerTest = new PowerCalculatorTest();
        powerTest.calculatePowerOfNumber();
    }

    public void calculatePowerOfNumber() {
        int number = 10;
        int power = 3;
        int expectedPowerResult = 1000;

        PowerCalculator powerCalculator = new PowerCalculator();
        int actualResult = powerCalculator.calculatePowerOfNumber(number, power);
        if (expectedPowerResult == actualResult) {
            System.out.println("Result of powered number  - TEST OK");
        } else {
            System.out.println("Result of powered - TEST FAILED");
        }
    }
}
