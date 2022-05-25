package student_devids_kropacovs.lesson9.level3.task12;

abstract class Car {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    abstract public int price(int price);
}
