package teacher.lesson_11_interfaces.lessoncode;

import java.math.BigDecimal;
import java.util.List;

class FireRiskPremiumCalculator {

	public BigDecimal calculate(Policy policy) {
		BigDecimal sumInsured = calculateFireSumInsured(policy);
		BigDecimal coefficient = defineFireCoefficient(sumInsured);
		return sumInsured.multiply(coefficient);
	}

	private BigDecimal calculateFireSumInsured(Policy policy) {
		BigDecimal sumInsuredFire = BigDecimal.ZERO;
		List<InsuredObject> insuredObjects = policy.getInsuredObjects();
		for (InsuredObject insuredObject : insuredObjects) {
			List<InsuredSubObject> subObjects = insuredObject.getSubObjects();
			for (InsuredSubObject subObject : subObjects) {
				if (RiskType.FIRE.equals(subObject.getRiskType())) {
					BigDecimal sumInsured = subObject.getSumInsured();
					sumInsuredFire = sumInsuredFire.add(sumInsured);
				}
			}
		}
		return sumInsuredFire;
	}

	private BigDecimal defineFireCoefficient(BigDecimal sumInsuredFire) {
		BigDecimal hundred = new BigDecimal("100.00");
		if (sumInsuredFire.compareTo(hundred) > 0) {
			return new BigDecimal("0.024");
		} else {
			return new BigDecimal("0.014");
		}
	}

}
