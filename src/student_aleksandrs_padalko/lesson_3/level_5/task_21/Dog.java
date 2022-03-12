package student_aleksandrs_padalko.lesson_3.level_5.task_21;

public class Dog { private String name; private String color;
    private int age;

    public Dog(String dogName, String dogColor, int dogAge) {
        this.name = dogName;
        this.color = dogColor;
        this.age = dogAge;
    }

    public void voice() {

        System.out.println("My name is "+ this.name + " I am "+this.color + " I am "+this.age + " years old");
    }

}
