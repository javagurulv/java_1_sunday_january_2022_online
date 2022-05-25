package student_sergei_klunkov.lesson_7.level_5;

class PowerCalculator {

    public  int powCalculator(int number, int powNumber) {
        if (powNumber == 0) {
            return 1;
        }
        int result = number;
        for (int i = 1; i < powNumber; i++){
            result = result * number;

        }
        return result;
    }

}
