package student_sergei_klunkov.lesson_4.lessoncode;

class CarDemo {

    public static void main(String[] args) {
        Car kia = new Car("KIA","Black");
        kia.printInfo();

        kia.engineOnOff();
        kia.accelerate();
        kia.accelerate();
        kia.accelerate();
        kia.accelerate();
        kia.accelerate();

        kia.printInfo();
        kia.engineOnOff();
        kia.printInfo();

        kia.engineOnOff();
        kia.decelerate();
        kia.printInfo();


    }
}
