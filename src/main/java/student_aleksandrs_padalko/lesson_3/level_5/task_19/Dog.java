package student_aleksandrs_padalko.lesson_3.level_5.task_19;

public class Dog { private String name;
    private int age;

    public Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;
    }

    public void voice() {

        System.out.println(this.name + "!" +this.age);
    }

}
