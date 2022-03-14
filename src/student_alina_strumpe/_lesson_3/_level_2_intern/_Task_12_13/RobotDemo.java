package student_alina_strumpe._lesson_3._level_2_intern._Task_12_13;

public class RobotDemo {

    public static void main(String[] args){

        Robot robot1 = new Robot("Hello", "Rider");
        Robot robot2 = new Robot("Hello", "John");

        robot1.sayHello();
        robot1.sayYourName();
        robot2.sayHello();
        robot2.sayYourName();

    }
}
