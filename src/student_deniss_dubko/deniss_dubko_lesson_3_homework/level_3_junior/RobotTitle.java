package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_3_junior;

class RobotTitle {

    private String name;

    public RobotTitle(String robotName) {

        this.name = robotName;
    }

    public void sayHello() {

        System.out.println("Hello!");
    }

    public void voiceYourName() {

        System.out.println("My name is " + this.name);
    }


}