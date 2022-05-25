package student_yevgeniy_tolks.lesson_14_JUnit.level1.task1_8;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public BigDecimal calculate(BigDecimal income) {
        BigDecimal taxPercentage = new BigDecimal("0.25");
        return taxPercentage.multiply(income.setScale(0, RoundingMode.DOWN));
    }

}
