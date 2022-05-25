package teacher.lesson_11_interfaces.lessoncode;

import java.util.List;

public class Policy {

	private String number;
	private PolicyStatus status;
	private List<InsuredObject> insuredObjects;

	public Policy(String number,
				  PolicyStatus status,
				  List<InsuredObject> insuredObjects) {
		this.number = number;
		this.status = status;
		this.insuredObjects = insuredObjects;
	}

	public String getNumber() {
		return number;
	}

	public PolicyStatus getStatus() {
		return status;
	}

	public List<InsuredObject> getInsuredObjects() {
		return insuredObjects;
	}
}
