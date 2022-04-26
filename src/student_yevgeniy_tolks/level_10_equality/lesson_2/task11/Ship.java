package student_yevgeniy_tolks.level_10_equality.lesson_2.task11;

class Ship {

private String name;
private int grossTonnage;

    protected Ship(String name, int grossTonnage) {
        this.name = name;
        this.grossTonnage = grossTonnage;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", grossTonnage=" + grossTonnage +
                '}';
    }
}
