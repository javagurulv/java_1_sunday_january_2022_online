package student_yevgeniy_tolks.lesson_11_interfaces.PremiumCalculatorImpl_Training.domain_model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

class PremiumCalculatorImpl implements PremiumCalculator {

    @Override
    public BigDecimal calculate(Policy policy) {
        BigDecimal premiumFire = calculatePremiumFire(policy);
        BigDecimal premiumTheft = calculatePremiumTheft(policy);
        BigDecimal addPremiums = premiumFire.add(premiumTheft);
        return addPremiums.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal calculatePremiumFire(Policy policy) {
        BigDecimal sumInsuredFire = calculateSumInsuredFire(policy);
        BigDecimal coefficientFire = coefficientInCaseOfFire(sumInsuredFire);
        return sumInsuredFire.multiply(coefficientFire);
    }

    public BigDecimal calculatePremiumTheft(Policy policy) {
        BigDecimal sumInsuredTheft = calculateSumInsuredTheft(policy);
        BigDecimal coefficientTheft = coefficientInCaseOfTheft(sumInsuredTheft);
        return sumInsuredTheft.multiply(coefficientTheft);
    }

    public BigDecimal calculateSumInsuredFire(Policy policy) {

        BigDecimal sumFire = BigDecimal.ZERO;
        List<InsuredObject> insuredObjectList = policy.getInsuredObjectList();
        for (InsuredObject insuredObject : insuredObjectList) {
            List<SubInsuredObject> subInsuredObjectList = insuredObject.getSubInsuredObjectList();
            sumFire = sumOfSubObjectsFire(subInsuredObjectList);
        }
        return sumFire;
    }

    public BigDecimal sumOfSubObjectsFire(List<SubInsuredObject> subInsuredObjectList) {
        BigDecimal sumOfSubObjectFire = BigDecimal.ZERO;
        for (SubInsuredObject subInsuredObject : subInsuredObjectList) {
            if (RiskType.FIRE.equals(subInsuredObject.getRisk())) {
                BigDecimal sumInsuredFire = subInsuredObject.getSumInsured();
                sumOfSubObjectFire = sumOfSubObjectFire.add(sumInsuredFire);
            }
        }
        return sumOfSubObjectFire;
    }

    public BigDecimal coefficientInCaseOfFire(BigDecimal sumInsuredFire) {
        BigDecimal hundred = new BigDecimal("100.00");
        if (sumInsuredFire.compareTo(hundred) > 0) {
            return new BigDecimal("0.024");
        } else {
            return new BigDecimal("0.014");
        }
    }

    public BigDecimal calculateSumInsuredTheft(Policy policy) {
        BigDecimal sumTheft = BigDecimal.ZERO;
        List<InsuredObject> insuredObjectList = policy.getInsuredObjectList();
        for (InsuredObject insuredObject : insuredObjectList) {
            List<SubInsuredObject> subInsuredObjectList = insuredObject.getSubInsuredObjectList();
            sumTheft=sumOfSubObjectsTheft(subInsuredObjectList);
        }
        return sumTheft;
    }

    public BigDecimal sumOfSubObjectsTheft(List<SubInsuredObject> subInsuredObjectList) {
        BigDecimal sumOfSubObjectTheft = BigDecimal.ZERO;
        for (SubInsuredObject subInsuredObject : subInsuredObjectList) {
            if (RiskType.THEFT.equals(subInsuredObject.getRisk())) {
                BigDecimal sumInsuredTheft = subInsuredObject.getSumInsured();
                sumOfSubObjectTheft = sumOfSubObjectTheft.add(sumInsuredTheft);
            }
        }
        return sumOfSubObjectTheft;
    }

    public BigDecimal coefficientInCaseOfTheft(BigDecimal sumInsuredTheft) {
        BigDecimal fifteen = new BigDecimal("15.00");
        if (sumInsuredTheft.compareTo(fifteen) >= 0) {
            return new BigDecimal("0.05");
        } else {
            return new BigDecimal("0.11");
        }
    }
}

