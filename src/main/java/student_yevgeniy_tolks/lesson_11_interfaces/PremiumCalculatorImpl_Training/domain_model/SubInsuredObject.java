package student_yevgeniy_tolks.lesson_11_interfaces.PremiumCalculatorImpl_Training.domain_model;

import java.math.BigDecimal;

class SubInsuredObject {

    private String subObjectName;
    private BigDecimal sumInsured;
    private RiskType risk;

    public SubInsuredObject(String subObjectName, BigDecimal sumInsured, RiskType risk) {
        this.subObjectName = subObjectName;
        this.sumInsured = sumInsured;
        this.risk = risk;
    }

    public String getSubObjectName() {
        return subObjectName;
    }

    public BigDecimal getSumInsured() {
        return sumInsured;
    }

    public RiskType getRisk() {
        return risk;
    }
}
