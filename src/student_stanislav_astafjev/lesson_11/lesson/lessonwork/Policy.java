package student_stanislav_astafjev.lesson_11.lesson.lessonwork;

import java.util.List;

public class Policy {

    private String number;
    private PolicyStatus status;
    private List<InsuredObject> insuredObject;

    public  Policy(String number,
                   PolicyStatus status,
                   List<InsuredObject> insuredObject) {
        this.number = number;
        this.status = status;
        this.insuredObject = insuredObject;
    }

    public String getNumber() {
        return number;
    }

    public PolicyStatus getStatus() {
        return status;
    }

    public List<InsuredObject> getInsuredObject() {
        return insuredObject;
    }
}
