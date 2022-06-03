package student_yevgeniy_tolks.lesson_15_streams.FunctionalProgrammingTraining.domain_model;

import java.math.BigDecimal;

interface PremiumCalculator {

    BigDecimal calculate(Policy policy);
}
