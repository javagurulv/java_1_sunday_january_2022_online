package student_yevgeniy_tolks.lesson_9.level_3.task_12;

public class RoRo extends ShipType {
    public RoRo(String nameOfShip, int grossTonnage) {
        super(nameOfShip, grossTonnage);
    }

    @Override
    boolean isDieselElectric() {
        return false;
    }
}
