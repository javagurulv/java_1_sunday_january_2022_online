package student_yevgeniy_tolks.lesson_11_interfaces.PremiumCalculatorImpl_Training.domain_model;

import java.util.List;

class Policy {
    private String policyNumber;
    private PolicyStatus status;
    private List<InsuredObject> insuredObjectList;

    public Policy(String policyNumber, PolicyStatus status, List<InsuredObject> insuredObjects) {
        this.policyNumber = policyNumber;
        this.status = status;
        this.insuredObjectList = insuredObjects;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public PolicyStatus getStatus() {
        return status;
    }

    public List<InsuredObject> getInsuredObjectList() {
        return insuredObjectList;
    }
}
