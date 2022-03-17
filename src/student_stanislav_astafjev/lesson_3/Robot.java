package student_stanislav_astafjev.lesson_3;

public class Robot {
    private String name;

    public Robot(String robotName) {

        this.name = robotName;
    }

    public void sayHello() {
        System.out.print("Hello ");
    }

    public void voiceYourName() {
        System.out.println("my name is " + this.name + "!");
    }


}