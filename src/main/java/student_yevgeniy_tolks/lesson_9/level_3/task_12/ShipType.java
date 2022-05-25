package student_yevgeniy_tolks.lesson_9.level_3.task_12;

abstract class ShipType {

    private String nameOfShip;
    private int grossTonnage;

    public ShipType(String nameOfShip, int grossTonnage) {
        this.nameOfShip = nameOfShip;
        this.grossTonnage = grossTonnage;
    }

    abstract boolean isDieselElectric();
}
