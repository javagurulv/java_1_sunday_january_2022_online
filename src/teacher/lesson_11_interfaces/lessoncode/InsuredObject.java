package teacher.lesson_11_interfaces.lessoncode;

import java.util.List;

public class InsuredObject {

	private String name;
	private List<InsuredSubObject> subObjects;

	public InsuredObject(String name,
						 List<InsuredSubObject> subObjects) {
		this.name = name;
		this.subObjects = subObjects;
	}

	public String getName() {
		return name;
	}

	public List<InsuredSubObject> getSubObjects() {
		return subObjects;
	}
}
