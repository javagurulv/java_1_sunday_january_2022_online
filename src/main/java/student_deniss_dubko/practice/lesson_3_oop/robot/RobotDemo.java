package student_deniss_dubko.practice.lesson_3_oop.robot;

import student_deniss_dubko.practice.lesson_3_oop.robot.Robot;

class RobotDemo {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Robo 1");
        robot1.sayHello();
        robot1.sayYourName();

        System.out.println();
        Robot robot2 = new Robot("Robo 2");
        robot2.sayHello();
        robot2.sayYourName();

        System.out.println();
        Robot robot3 = new Robot("Robo 3");
        robot3.sayHello();
        robot3.sayYourName();
    }

}