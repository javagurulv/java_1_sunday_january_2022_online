package student_yevgeniy_tolks.lesson_3.level_3;

class RobotDemo {
    public static void main(String[] args) {

        //creating virtual robot1
        Robot robot1=new Robot("Vale!");
        robot1.sayHello();
        robot1.sayYourName();

        //creating virtual robot2
        Robot robot2=new Robot("Craig!");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
