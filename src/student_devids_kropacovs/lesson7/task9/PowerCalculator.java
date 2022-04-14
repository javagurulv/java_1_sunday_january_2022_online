package student_devids_kropacovs.lesson7.task9;

class PowerCalculator {

    public double powerNumber(int numberToPower, int powerOfNumber) {
        if (powerOfNumber == 0) {
            return 1;
        } else if (powerOfNumber == 1) {
            return numberToPower;
        } else if (powerOfNumber > 1) {
            double result = 1;
            for (int i = 0; i < powerOfNumber; i++) {
                result = result * numberToPower;
            }
            return result;
        } else {
            double result = 1;
            for (int i = 0; i < -powerOfNumber; i++) {
                result = result / numberToPower;
            }
            return result;
        }

    }
}
