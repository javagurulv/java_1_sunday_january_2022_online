package student_sergei_klunkov.lesson_3.homework;

public class Robot {

    private String name;
    private String sayHello;

    public Robot(String robotName, String sayHello) {

        this.name = robotName;
        this.sayHello= sayHello;


    }

    public static void main(String[] args) {

    }

    public void hello() {
        System.out.println("Hello!");
    }
    public void name()
    { System.out.println("My name is " + this.name);

    }





}
