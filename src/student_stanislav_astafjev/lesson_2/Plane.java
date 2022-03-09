package student_stanislav_astafjev.lesson_2;

public class Plane {

    private String fly;
    private int hours;

    public Plane(String planeFly, int planeHours) {
        this.fly = planeFly;
        this.hours = planeHours;
    }
    public void voiceYourFly() {
        System.out.println("I will " + this.fly + " on a plane ");

    }
    public void voiceYourHours(){
        System.out.println(this.hours + " Hours");
    }



}

