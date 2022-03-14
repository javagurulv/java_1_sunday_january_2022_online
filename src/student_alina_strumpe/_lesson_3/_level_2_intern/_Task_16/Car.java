package student_alina_strumpe._lesson_3._level_2_intern._Task_16;

public class Car {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
