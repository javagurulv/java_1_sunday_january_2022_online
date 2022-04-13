package student_sergei_klunkov.lesson_7.level_5;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.testPowerNumberZero();
        powerCalculatorTest.testRandomNumber();
        powerCalculatorTest.testPowerNumberIsOne();


    }


    public void testPowerNumberZero() {
        PowerCalculator powerCalculator = new PowerCalculator();
        if ( 1 == powerCalculator.powCalculator(2,0)){
            System.out.println("PowerNumberZero test - PASSED!");
        } else {
            System.out.println("PowerNumberZero test - FAILED!");
        }

    }

    public void testRandomNumber() {
        PowerCalculator powerCalculator = new PowerCalculator();
        if( 1 == powerCalculator.powCalculator(2, 0)){
            System.out.println("RandomNumber test - PASSED!");
        } else {
            System.out.println("RandomNumber test - FAILED!");
        }
    }

    public void testPowerNumberIsOne() {
        PowerCalculator powerCalculator = new PowerCalculator();
        if( 2 == powerCalculator.powCalculator(2, 1)){
            System.out.println("PowerNumberIsOne test - PASSED!");
        } else {
            System.out.println("PowerNumberIsOne test - FAILED!");
        }


    }

}
