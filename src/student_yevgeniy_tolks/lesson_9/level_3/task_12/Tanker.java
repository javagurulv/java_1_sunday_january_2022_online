package student_yevgeniy_tolks.lesson_9.level_3.task_12;

public class Tanker extends ShipType {
    public Tanker(String nameOfShip, int grossTonnage) {
        super(nameOfShip, grossTonnage);
    }

    @Override
    boolean isDieselElectric() {
        return false;
    }
}
