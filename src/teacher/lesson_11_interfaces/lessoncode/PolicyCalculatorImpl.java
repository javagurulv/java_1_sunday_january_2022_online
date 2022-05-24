package teacher.lesson_11_interfaces.lessoncode;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PolicyCalculatorImpl implements PolicyCalculator {

	private FireRiskPremiumCalculator fireRiskPremiumCalculator = new FireRiskPremiumCalculator();
	private TheftRiskPremiumCalculator theftRiskPremiumCalculator = new TheftRiskPremiumCalculator();

	@Override
	public BigDecimal calculate(Policy policy) {
		BigDecimal premiumFire = fireRiskPremiumCalculator.calculate(policy);
		BigDecimal premiumTheft = theftRiskPremiumCalculator.calculate(policy);
		return premiumFire.add(premiumTheft)
				.setScale(2, RoundingMode.HALF_UP);
	}

}
