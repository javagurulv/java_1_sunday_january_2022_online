package student_yevgeniy_tolks.lesson_11_interfaces.PremiumCalculatorImpl_Training.domain_model;

import java.math.BigDecimal;

interface PremiumCalculator {

    BigDecimal calculate(Policy policy);
}
