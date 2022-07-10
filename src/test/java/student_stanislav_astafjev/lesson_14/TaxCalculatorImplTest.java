package student_stanislav_astafjev.lesson_14;

import org.junit.Test;
import student_stanislav_astafjev.lesson_11.lesson.lessonwork.*;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TaxCalculatorImplTest {

    @Test
    public void testCase1(){
        InsuredSubObject object1 = new InsuredSubObject("TV", RiskType.FIRE, new BigDecimal("100.00"));
        InsuredSubObject object2 = new InsuredSubObject("LAPTOP", RiskType.THEFT, new BigDecimal("8.00"));
        List<InsuredSubObject> subObjects = List.of(object1,object2);
        InsuredObject insuredObject = new InsuredObject("House", subObjects);
        List<InsuredObject> insuredObjects = List.of(insuredObject);
        Policy policy = new Policy("LV-1", PolicyStatus.REGISTERED, insuredObjects);

        PolicyCalculator policyCalculator = new PolicyCalculatorImpl();

        BigDecimal premium = policyCalculator.calculate(policy);
        BigDecimal testEval = new BigDecimal("2.28");

        assertEquals(premium, testEval);
    }

    @Test
    public void testCase2() {
        InsuredSubObject object1 = new InsuredSubObject("TV", RiskType.FIRE, new BigDecimal("500.00"));
        InsuredSubObject object2 = new InsuredSubObject("LAPTOP", RiskType.THEFT, new BigDecimal("102.51"));
        List<InsuredSubObject> subObjects = List.of(object1, object2);
        InsuredObject insuredObject = new InsuredObject("House", subObjects);
        List<InsuredObject> insuredObjects = List.of(insuredObject);
        Policy policy = new Policy("LV-1", PolicyStatus.REGISTERED, insuredObjects);

        PolicyCalculator policyCalculator = new PolicyCalculatorImpl();
        BigDecimal premium = policyCalculator.calculate(policy);
        BigDecimal testEval = new BigDecimal("17.13");

        assertEquals(premium, testEval);

    }
}
