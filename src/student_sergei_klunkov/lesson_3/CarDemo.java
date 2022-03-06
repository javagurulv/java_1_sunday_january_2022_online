package student_sergei_klunkov.lesson_3;


public class CarDemo {

    public static void main(String[] args) {
        Car audi = new Car("Audi", false);
        Car bmw = new Car("Bmw", false);

        audi.voice();
        bmw.voice();

        audi.turnRadioOn();
        bmw.turnRadioOn();
        System.out.println("Audi radio = " + audi.isRadioOn());

        audi.turnRadioOff();
        bmw.turnRadioOff();
        System.out.println("Audi radio = " + audi.isRadioOn());


    }

}

