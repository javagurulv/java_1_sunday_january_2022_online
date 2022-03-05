package student_devids_kropacovs.lesson3.level1and3;


class Robot {

    public String roboName;
    public void sayHello() {
        System.out.println("Hello! ");
    }
    public Robot(String robotName) {
        this.roboName = robotName;
    }
    public void sayYourName(){
        System.out.println("My name is " + roboName);
    }
}
