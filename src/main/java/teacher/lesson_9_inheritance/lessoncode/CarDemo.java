package teacher.lesson_9_inheritance.lessoncode;

public class CarDemo {

	public static void main(String[] args) {

		//Car car = new Car();

		ElectricCar electricCar = new ElectricCar("Tesla 3", 100);
		String electricCarStr = electricCar.toString();
		System.out.println(electricCarStr);


		PetrolCar petrolCar = new PetrolCar("Ferrary Monza");

		electricCar.start();
		electricCar.stop();

		petrolCar.start();
		petrolCar.start();

		Car car1 = electricCar;
		Car car2 = petrolCar;

		Object objectCar = new ElectricCar("Tesla 3", 100);
		//objectCar.start();
		//objectCar.stop();
		//objectCar.updateComputerSystem();
		objectCar.equals(car1);
		System.out.println(objectCar.toString());

		Car car = new ElectricCar("Tesla 3", 100);;
		car.start();
		car.stop();
		car.updateComputerSystem();

		Car car3 = new ElectricCar("Tesla 3", 100);
		Car car4 = new PetrolCar("Ferrary Monza");

		electricCar = new ElectricCar("Tesla 3", 100);

		boolean isEquals = car3.equals(electricCar);
		System.out.println("Cars are equals = " + isEquals);

		Car[] cars = new Car[2];
		cars[0] = new ElectricCar("Tesla 3", 100);
		cars[1] = new PetrolCar("Ferrary Monza");

		for (Car carr : cars) {
			carr.updateComputerSystem();
		}


		/*Car car = new Car("Nissan");
		car.start();
		car.stop();*/

	}

}
