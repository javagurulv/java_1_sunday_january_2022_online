package student_aleksandrs_padalko.lesson_3.level_1;


import student_aleksandrs_padalko.lesson_3.level_1.Robot;

public class RobotDemo { public static void main(String[] args) {

    Robot robo = new Robot("Robo");
    Robot robot1 = new Robot("Robot1");
    Robot robot2 = new Robot("Robot2");

    robo.voice();

    robo.voiceYourName();


    robot1.voice();
    robot1.voiceYourName();


    robot2.voice();
    robot2.voiceYourName();




}

}