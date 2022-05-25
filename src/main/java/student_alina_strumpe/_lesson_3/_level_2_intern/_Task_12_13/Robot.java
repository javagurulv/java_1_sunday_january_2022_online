package student_alina_strumpe._lesson_3._level_2_intern._Task_12_13;

public class Robot {

    private String greeting;
    private String robotName;

    public Robot(String greeting, String robotName){
        this.greeting = greeting;
        this.robotName = robotName;
    }

    public void sayHello(){System.out.println(this.greeting);}

    public void sayYourName(){ System.out.println("My neame is "+this.robotName);}
}
