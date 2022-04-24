package teacher.lesson_9_inheritance.lessoncode;

import java.util.Objects;

public class ElectricCar extends Car {

	private int bateryCapacy;

	public ElectricCar(String model, int bateryCapacy) {
		super(model);
		this.bateryCapacy = bateryCapacy;
	}

	@Override
	public void start() {
		if (this.bateryCapacy > 0) {
			this.bateryCapacy--;
			System.out.println("Accumulator switched ON!");
		} else {
			System.out.println("Accumulator is empty!");
		}
	}

	@Override
	public void stop() {
		System.out.println("Accumulator switched OFF!");
	}

	@Override
	public boolean updateComputerSystem() {
		if (this.bateryCapacy > 0) {
			this.bateryCapacy--;
			System.out.println("Update Computer System!");
			return true;
		} else {
			System.out.println("Accumulator is empty!");
			return false;
		}
	}

	@Override
	public String toString() {
		return "ElectricCar{" +
				"model=" + getModel() + ", " +
				"bateryCapacy=" + bateryCapacy +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ElectricCar that = (ElectricCar) o;
		return this.bateryCapacy == that.bateryCapacy;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bateryCapacy);
	}

}
