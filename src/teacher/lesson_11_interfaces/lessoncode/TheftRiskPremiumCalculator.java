package teacher.lesson_11_interfaces.lessoncode;

import java.math.BigDecimal;
import java.util.List;

class TheftRiskPremiumCalculator {

	public BigDecimal calculate(Policy policy) {
		BigDecimal sumInsured = calculateTheftSumInsured(policy);
		BigDecimal coefficient = defineTheftCoefficient(sumInsured);
		return sumInsured.multiply(coefficient);
	}

	private BigDecimal calculateTheftSumInsured(Policy policy) {
		BigDecimal sumInsuredTheft = BigDecimal.ZERO;
		List<InsuredObject> insuredObjects = policy.getInsuredObjects();
		for (InsuredObject insuredObject : insuredObjects) {
			List<InsuredSubObject> subObjects = insuredObject.getSubObjects();
			for (InsuredSubObject subObject : subObjects) {
				if (RiskType.THEFT.equals(subObject.getRiskType())) {
					BigDecimal sumInsured = subObject.getSumInsured();
					sumInsuredTheft = sumInsuredTheft.add(sumInsured);
				}
			}
		}
		return sumInsuredTheft;
	}


	private BigDecimal defineTheftCoefficient(BigDecimal sumInsuredTheft) {
		BigDecimal hundred = new BigDecimal("15.00");
		if (sumInsuredTheft.compareTo(hundred) >= 0) {
			return new BigDecimal("0.05");
		} else {
			return new BigDecimal("0.11");
		}
	}

}
