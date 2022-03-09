package student_sergei_klunkov.lesson_3.homework;

class RobotDemo {

    private String name;

    public static void main(String[] args) {
        Robot robotOne = new Robot("RobotOne","Hello!");
        Robot robotTwo = new Robot("RobotTwo","Hello!");

        robotOne.hello();
        robotOne.name();
        robotTwo.hello();
        robotTwo.name();




    }

}

