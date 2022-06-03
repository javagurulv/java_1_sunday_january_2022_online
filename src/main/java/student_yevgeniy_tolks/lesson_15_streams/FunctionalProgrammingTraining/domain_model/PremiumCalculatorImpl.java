package student_yevgeniy_tolks.lesson_15_streams.FunctionalProgrammingTraining.domain_model;

import teacher.lesson_11_interfaces.lessoncode.InsuredSubObject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

class PremiumCalculatorImpl implements PremiumCalculator {

    @Override
    public BigDecimal calculate(Policy policy) {
        BigDecimal premiumFire = calculatePremiumFire(policy);
        BigDecimal premiumTheft = calculatePremiumTheft(policy);
        BigDecimal addPremiums = premiumFire.add(premiumTheft);
        return addPremiums.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal calculatePremiumFire(Policy policy) {
        BigDecimal sumInsuredFire = calculateSumInsuredFire.apply(policy);
        BigDecimal coefficientFire = coefficientInCaseOfFire.apply(sumInsuredFire);
        return sumInsuredFire.multiply(coefficientFire);
    }

    public BigDecimal calculatePremiumTheft(Policy policy) {
        BigDecimal sumInsuredTheft = calculateSumInsuredTheft.apply(policy);
        BigDecimal coefficientTheft = coefficientInCaseOfTheft.apply(sumInsuredTheft);
        return sumInsuredTheft.multiply(coefficientTheft);
    }

    public Function<Policy,BigDecimal> calculateSumInsuredFire =
            policy -> policy.getInsuredObjectList()
                    .stream()
                    .flatMap(insuredObject -> insuredObject.getSubInsuredObjectList().stream())
                    .filter(subInsuredObjects -> RiskType.FIRE.equals(subInsuredObjects.getRisk()))
                    .map(SubInsuredObject::getSumInsured)
                    .findAny()
                    .get();

     public Function<BigDecimal, BigDecimal> coefficientInCaseOfFire =
            number -> number.compareTo(new BigDecimal("100.00")) > 0
                    ? new BigDecimal("0.024") : new BigDecimal("0.014");

    public Function<Policy,BigDecimal> calculateSumInsuredTheft =
            policy -> policy.getInsuredObjectList()
                    .stream()
                    .flatMap(insuredObject -> insuredObject.getSubInsuredObjectList().stream())
                    .filter(subInsuredObjects -> RiskType.THEFT.equals(subInsuredObjects.getRisk()))
                    .map(SubInsuredObject::getSumInsured)
                    .findAny()
                    .get();

   public Function<BigDecimal, BigDecimal> coefficientInCaseOfTheft =
            number -> number.compareTo(new BigDecimal("15.00")) >= 0
                    ? new BigDecimal("0.05") : new BigDecimal("0.11");
}

