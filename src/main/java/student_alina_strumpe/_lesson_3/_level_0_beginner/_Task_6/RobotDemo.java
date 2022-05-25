package student_alina_strumpe._lesson_3._level_0_beginner._Task_6;

public class RobotDemo {

    public static void main(String[] args){

        Robot robot1 = new Robot("Hello", "RB01");
        Robot robot2 = new Robot("Hello", "RB02");

        robot1.sayHello();
        robot1.sayYourName();

        robot2.sayHello();
        robot2.sayYourName();
    }
}