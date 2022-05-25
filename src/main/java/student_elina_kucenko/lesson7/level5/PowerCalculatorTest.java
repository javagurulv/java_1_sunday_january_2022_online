package student_elina_kucenko.lesson7.level5;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.powerNumberTestForRandomNumber();
        powerCalculatorTest.powerNumberTestForZero();
        powerCalculatorTest.powerNumberTestForOne();

    }

    public void powerNumberTestForRandomNumber() {
        PowerCalculator powerCalculator = new PowerCalculator();
        if (1 == powerCalculator.powerNumber(7, 0)) {
            System.out.println("Power Number Test for random number- OK");
        } else {
            System.out.println("Power Number Test for random number - failed");
        }
    }

    public void powerNumberTestForZero() {
        PowerCalculator powerCalculator = new PowerCalculator();
        if (1 == powerCalculator.powerNumber(7, 0)) {
            System.out.println("Power Number Test for zero- OK");
        } else {
            System.out.println("Power Number Test for zero - failed");
        }
    }

    public void powerNumberTestForOne() {
        PowerCalculator powerCalculator = new PowerCalculator();
        if (7 == powerCalculator.powerNumber(7, 1)) {
            System.out.println("Power Number Test for one - OK");
        } else {
            System.out.println("Power Number Test for one - failed");
        }
    }
}
