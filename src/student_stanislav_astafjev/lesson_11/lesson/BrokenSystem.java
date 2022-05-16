package student_stanislav_astafjev.lesson_11.lesson;

import java.math.BigDecimal;

public class BrokenSystem {
    public static void main(String[] args) {
        InsurancePolicyCalculator calculator =
                new InsurancePolicyCalculatorImpl();

        Policy policy = new Policy();
        BigDecimal policyPrice = calculator.calculate(policy);

        Broken broken = new Broken(calculator);
        broken.run();
    }
}
