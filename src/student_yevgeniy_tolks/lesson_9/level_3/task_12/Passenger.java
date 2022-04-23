package student_yevgeniy_tolks.lesson_9.level_3.task_12;

class Passenger extends ShipType {
    public Passenger(String nameOfShip, int grossTonnage) {
        super(nameOfShip, grossTonnage);
    }

    @Override
    boolean isDieselElectric() {
        return true;
    }
}
