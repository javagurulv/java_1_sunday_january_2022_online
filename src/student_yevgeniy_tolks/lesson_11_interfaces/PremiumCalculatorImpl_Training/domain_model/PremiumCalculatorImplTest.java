package student_yevgeniy_tolks.lesson_11_interfaces.PremiumCalculatorImpl_Training.domain_model;

import java.math.BigDecimal;
import java.util.List;

class PremiumCalculatorImplTest {
    public static void main(String[] args) {
        PremiumCalculatorImplTest test = new PremiumCalculatorImplTest();
        test.policyCalculatorTest1();
        test.policyCalculatorTest2();
    }

    public void policyCalculatorTest1() {
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
        if (premium.equals(new BigDecimal("2.28"))) {
            System.out.println("TEST OK");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    public void policyCalculatorTest2() {
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
        if (premium.equals(new BigDecimal("17.13"))) {
            System.out.println("TEST OK");
        } else {
            System.out.println("TEST FAILED");
        }
    }
}
