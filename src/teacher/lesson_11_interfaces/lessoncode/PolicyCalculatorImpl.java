package teacher.lesson_11_interfaces.lessoncode;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

public class PolicyCalculatorImpl implements PolicyCalculator {

	@Override
	public BigDecimal calculate(Policy policy) {
		BigDecimal premiumFire = calculatePremiumFire(policy);
		BigDecimal premiumTheft = calculatePremiumTheft(policy);
		return premiumFire.add(premiumTheft)
				.setScale(2, RoundingMode.HALF_UP);
	}

	private BigDecimal calculatePremiumFire(Policy policy) {
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

	private BigDecimal calculatePremiumTheft(Policy policy) {
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
