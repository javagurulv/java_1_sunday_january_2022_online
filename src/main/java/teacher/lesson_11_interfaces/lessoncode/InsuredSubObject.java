package teacher.lesson_11_interfaces.lessoncode;

import java.math.BigDecimal;

public class InsuredSubObject {

	private String name;
	private RiskType riskType;
	private BigDecimal sumInsured;

	public InsuredSubObject(String name,
							RiskType riskType,
							BigDecimal sumInsured) {
		this.name = name;
		this.riskType = riskType;
		this.sumInsured = sumInsured;
	}

	public String getName() {
		return name;
	}

	public RiskType getRiskType() {
		return riskType;
	}

	public BigDecimal getSumInsured() {
		return sumInsured;
	}
}
