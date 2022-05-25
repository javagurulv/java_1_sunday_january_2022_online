package student_sergei_klunkov.lesson_3.homework.level_3;

class Robot {

    private String name;
    private String sayHello;

    public Robot(String robotName, String sayHello) {

        this.name = robotName;
        this.sayHello= sayHello;


    }

    public void hello() {

        System.out.println("Hello!");
    }

    public void name() {
        System.out.println("My name is " + this.name);

    }

}
