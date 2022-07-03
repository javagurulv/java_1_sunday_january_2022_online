package student_deniss_dubko.deniss_dubko_lesson_7_homework.level_5_middle;

class PowerCalculator {

    public int raisingNumberToPower(int number, int power) {
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