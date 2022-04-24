package student_stanislav_astafjev.lesson_3.Task_1;

import student_stanislav_astafjev.lesson_3.Task_1.Robot;

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
