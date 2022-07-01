package student_deniss_dubko.deniss_dubko_lesson_7_homework.level_5_middle;

class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest test = new PowerCalculatorTest();
        test.shouldRaiseNumberToPower();
    }

    public void shouldRaiseNumberToPower() {
        int number = 4;
        int power = 2;
        int expectedResult = 16;
        PowerCalculator calculator = new PowerCalculator();
        int realResult = calculator.raisingNumberToPower(number, power);
        if (realResult == expectedResult) {
            System.out.println("Raising Number To Power Test = OK");
        } else {
            System.out.println("Raising Number To Power Test = FAIL");
        }
    }

}