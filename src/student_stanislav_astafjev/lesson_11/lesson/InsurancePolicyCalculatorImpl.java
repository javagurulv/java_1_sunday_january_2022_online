package student_stanislav_astafjev.lesson_11.lesson;

import java.math.BigDecimal;

class InsurancePolicyCalculatorImpl
        implements InsurancePolicyCalculator {

    @Override
    public BigDecimal calculate(Policy policy) {
        return new BigDecimal("1.0");
    }
}