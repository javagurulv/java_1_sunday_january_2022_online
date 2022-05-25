package student_aleksandra_jefimova.lesson_3.level_5.task_19;

class Dog {
    int age;
    String name;

    Dog(int dogAge, String dogName) {
        this.age = dogAge;
        this.name = dogName;
    }

    public void voice() {
        System.out.println(name);
        System.out.println(age);

    }

}
