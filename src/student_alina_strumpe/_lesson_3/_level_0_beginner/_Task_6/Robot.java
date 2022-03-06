package student_alina_strumpe._lesson_3._level_0_beginner._Task_6;

public class Robot {

    private String greeting;
    private String name;

    public Robot(String greeting, String name){
        this.greeting = greeting;
        this.name = name;
    }
    public void sayHello() { System.out.print(greeting);}

    public void sayYourName() { System.out.println("My name is "+ this.name);}
}
