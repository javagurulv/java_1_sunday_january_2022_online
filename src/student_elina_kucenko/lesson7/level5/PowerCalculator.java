package student_elina_kucenko.lesson7.level5;

class PowerCalculator {

    public int powerNumber(int number, int power) {
        if (power == 0) {
            return 1;
        }
        int result = number;
        for (int i = 1; i < power; i++) {
            result = result * number;

        }
        return result;
    }
}
