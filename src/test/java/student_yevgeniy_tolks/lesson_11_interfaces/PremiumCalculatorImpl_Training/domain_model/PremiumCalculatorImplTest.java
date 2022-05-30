package student_yevgeniy_tolks.lesson_11_interfaces.PremiumCalculatorImpl_Training.domain_model;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class PremiumCalculatorImplTest {

    PremiumCalculatorImpl premiumCalculator;

    @Before
    public void init() {
        premiumCalculator = new PremiumCalculatorImpl();
    }

    @Test
    public void calculatePolicyTest1() {
        SubInsuredObject subInsuredObject1 = new SubInsuredObject(
                "TV", new BigDecimal("100.00"), RiskType.FIRE);
        SubInsuredObject subInsuredObject2 = new SubInsuredObject(
                "Laptop", new BigDecimal("8.00"), RiskType.THEFT);
        List<SubInsuredObject> subInsuredObjectList = List.of(subInsuredObject1, subInsuredObject2);
        InsuredObject insuredObject = new InsuredObject("House", subInsuredObjectList);
        List<InsuredObject> insuredObjectList = List.of(insuredObject);
        Policy policy = new Policy("LV-1234", PolicyStatus.REGISTERED, insuredObjectList);

        PremiumCalculatorImpl premiumCalculator = new PremiumCalculatorImpl();
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(premium, new BigDecimal("2.28"));

    }

    @Test
    public void calculatePolicyTest2() {
        SubInsuredObject subInsuredObject1 = new SubInsuredObject(
                "TV", new BigDecimal("500.00"), RiskType.FIRE);
        SubInsuredObject subInsuredObject2 = new SubInsuredObject(
                "Laptop", new BigDecimal("102.51"), RiskType.THEFT);
        List<SubInsuredObject> subInsuredObjectList = List.of(subInsuredObject1, subInsuredObject2);
        InsuredObject insuredObject = new InsuredObject("House", subInsuredObjectList);
        List<InsuredObject> insuredObjectList = List.of(insuredObject);
        Policy policy = new Policy("LV-1234", PolicyStatus.REGISTERED, insuredObjectList);

        PremiumCalculatorImpl premiumCalculator = new PremiumCalculatorImpl();
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(premium, new BigDecimal("17.13"));
    }

    @Test
    public void coefficientInCaseOfFireWhenSumInsuredOver100Test() {
        BigDecimal coefficientWhenSomeInsuredFireOver100 = premiumCalculator
                .coefficientInCaseOfFire(new BigDecimal(120));
        assertEquals(coefficientWhenSomeInsuredFireOver100, new BigDecimal("0.024"));
    }

    @Test
    public void coefficientWhenSumInsuredFireLessThan100Test() {
        BigDecimal coefficientWhenSomeInsuredFireOver100 = premiumCalculator
                .coefficientInCaseOfFire(new BigDecimal(90));
        assertEquals(coefficientWhenSomeInsuredFireOver100, new BigDecimal("0.014"));
    }

    @Test
    public void coefficientWhenSumInsuredTheftMoreOrEqual15Test() {
        BigDecimal coefficientWhenSumInsuredTheftMoreOrEquals15 = premiumCalculator
                .coefficientInCaseOfTheft(new BigDecimal("15.00"));
        assertEquals(coefficientWhenSumInsuredTheftMoreOrEquals15, new BigDecimal("0.05"));
    }

    @Test
    public void coefficientWhenSumInsuredTheftMoreLessThan15Test() {
        BigDecimal coefficientWhenSumInsuredTheftMoreOrEquals15 = premiumCalculator
                .coefficientInCaseOfTheft(new BigDecimal("14.00"));
        assertEquals(coefficientWhenSumInsuredTheftMoreOrEquals15, new BigDecimal("0.11"));
    }
}