package student_sergei_klunkov.lesson_3.homework.level_1;

public class Robot {

    private String sayYourName;
    private String sayHello;

    public Robot(String robotName, String sayHello) {

        this.sayYourName = robotName;
        this.sayHello= sayHello;


    }

    public void hello() {
        System.out.println("Hello!");
    }
    public void name()
    { System.out.println("My name is " + this.sayYourName);

    }





}
