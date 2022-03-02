package student_elina_kucenko.lesson3.level3;

public class Robot {

    String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + name);
    }
}
