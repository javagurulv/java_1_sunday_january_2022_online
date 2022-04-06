package student_yevgeniy_tolks.lesson_7.level_5;

public class PowerCalculator {

    public int calculatePowerOfNumber(int enteredNumber, int pow) {
        int powResult = 1;
        for (int i = 1; i <= pow; i++) {
            powResult = powResult * enteredNumber;
        }
        return powResult;
    }
}
