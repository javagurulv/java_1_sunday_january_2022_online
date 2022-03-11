package student_aleksandra_jefimova.lesson_3.level_5.task_21;

class Dog {

    private String name;
    private int age;
    private String colour;

    public Dog(String dogName, int dogAge, String dogColour) {
        this.name = dogName;
        this.age = dogAge;
        this.colour = dogColour;
    }

    public void voice() {

        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.colour);

    }
}
