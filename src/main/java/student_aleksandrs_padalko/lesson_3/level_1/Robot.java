package student_aleksandrs_padalko.lesson_3.level_1;



public class Robot {

    private String name;


    public Robot(String robotName) {
        this.name = robotName;

    }

    public void voice() {
    System.out.println("Hello!");
    }

    public void voiceYourName() {
        System.out.println("My name is " + this.name);
    }



}
