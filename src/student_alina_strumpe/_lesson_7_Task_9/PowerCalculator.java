package student_alina_strumpe._lesson_7_Task_9;

class PowerCalculator {

    private int baseNumber;
    private int exponentNumber;
    private int result;

    public PowerCalculator() {
        this.baseNumber = baseNumber;
        this.exponentNumber = exponentNumber;
    }

    public int powerOfNumbers(int baseNumber, int exponentNumber) {
        int power = 1;
        for (int i = 1; i <= exponentNumber; i++) {
            power = power * baseNumber;
        }
        return power;
    }

    public void printResult(int result) {
        System.out.println("The result of the power is  "+result);
    }

}
