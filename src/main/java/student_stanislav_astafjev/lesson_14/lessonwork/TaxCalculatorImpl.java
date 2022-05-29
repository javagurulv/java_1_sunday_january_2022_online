package student_stanislav_astafjev.lesson_14.lessonwork;

public class TaxCalculatorImpl implements TaxCalculator {


    @Override
    public double calculate(double income) {
        return income * 2.25;
    }
}
