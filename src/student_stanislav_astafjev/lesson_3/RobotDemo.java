package student_stanislav_astafjev.lesson_3;

import teacher.lesson_3_oop_first_look.lessoncode.Dog;

public class RobotDemo {
    public static void main(String[] args) {

        Robot robot1 = new Robot("Terminator");
        robot1.sayHello();
        robot1.voiceYourName();

        Robot robot2 = new Robot("RoboCop");
        robot2.sayHello();
        robot2.voiceYourName();

        Robot robot3 = new Robot("Qwerty");
        robot3.sayHello();
        robot3.voiceYourName();

    }

}
