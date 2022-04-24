package teacher.lesson_9_inheritance.lessoncode;

import java.util.Objects;

public abstract class Car extends Object {

	private String model;

	public Car(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public abstract void start();

	public abstract void stop();

	public abstract boolean updateComputerSystem();

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Car car = (Car) o;
		return Objects.equals(model, car.model);
	}

	@Override
	public int hashCode() {
		return Objects.hash(model);
	}
}
