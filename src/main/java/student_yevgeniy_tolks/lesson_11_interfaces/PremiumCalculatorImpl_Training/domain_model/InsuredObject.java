package student_yevgeniy_tolks.lesson_11_interfaces.PremiumCalculatorImpl_Training.domain_model;

import java.util.List;

class InsuredObject {

    private String insuredObjectName;
    private List<SubInsuredObject> subInsuredObjectList;

    public InsuredObject(String insuredObjectName, List<SubInsuredObject> subInsuredObjectList) {
        this.insuredObjectName = insuredObjectName;
        this.subInsuredObjectList = subInsuredObjectList;
    }

    public String getInsuredObjectName() {
        return insuredObjectName;
    }

    public List<SubInsuredObject> getSubInsuredObjectList() {
        return subInsuredObjectList;
    }
}
