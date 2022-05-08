package teacher.lesson_11_interfaces.lessoncode;

import java.math.BigDecimal;
import java.util.List;

public class PolicyCalculatorImplTest {

	public static void main(String[] args) {
		PolicyCalculatorImplTest test = new PolicyCalculatorImplTest();
		test.testCase1();
		test.testCase2();
	}

	public void testCase1() {
		InsuredSubObject object1 = new InsuredSubObject("TV", RiskType.FIRE, new BigDecimal("100.00"));
		InsuredSubObject object2 = new InsuredSubObject("LAPTOP", RiskType.THEFT, new BigDecimal("8.00"));
		List<InsuredSubObject> subObjects = List.of(object1, object2);
		InsuredObject insuredObject = new InsuredObject("House", subObjects);
		List<InsuredObject> insuredObjects = List.of(insuredObject);
		Policy policy = new Policy("LV-1", PolicyStatus.REGISTERED, insuredObjects);

		PolicyCalculator policyCalculator = new PolicyCalculatorImpl();
		BigDecimal premium = policyCalculator.calculate(policy);

		if (premium.equals(new BigDecimal("2.28"))) {
			System.out.println("TEST 1 = OK");
		} else {
			System.out.println("TEST 1 = FAIL");
		}
	}

	public void testCase2() {
		InsuredSubObject object1 = new InsuredSubObject("TV", RiskType.FIRE, new BigDecimal("500.00"));
		InsuredSubObject object2 = new InsuredSubObject("LAPTOP", RiskType.THEFT, new BigDecimal("102.51"));
		List<InsuredSubObject> subObjects = List.of(object1, object2);
		InsuredObject insuredObject = new InsuredObject("House", subObjects);
		List<InsuredObject> insuredObjects = List.of(insuredObject);
		Policy policy = new Policy("LV-1", PolicyStatus.REGISTERED, insuredObjects);

		PolicyCalculator policyCalculator = new PolicyCalculatorImpl();
		BigDecimal premium = policyCalculator.calculate(policy);

		if (premium.equals(new BigDecimal("17.13"))) {
			System.out.println("TEST 2 = OK");
		} else {
			System.out.println("TEST 2 = FAIL");
		}
	}


}
