package teacher.lesson_10_objects_equality.lessoncode;

public class ElectricCar extends Car {

	public ElectricCar(boolean isSwithedOn, double fuel) {
		super(isSwithedOn, fuel);
	}

	public void start() {
		this.isSwithedOn = true;
	}

}
