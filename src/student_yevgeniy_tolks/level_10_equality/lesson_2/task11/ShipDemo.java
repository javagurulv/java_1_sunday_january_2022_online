package student_yevgeniy_tolks.level_10_equality.lesson_2.task11;

class ShipDemo {
    public static void main(String[] args) {
        Ship tanker = new Tanker("Aidamar" , 72000);
        String shipData =tanker.toString();
        System.out.println(shipData);
    }
}
