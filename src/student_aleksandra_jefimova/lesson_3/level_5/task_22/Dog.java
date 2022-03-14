package student_aleksandra_jefimova.lesson_3.level_5.task_22;

class Dog {private String name;
    private String colour;

    public Dog(String dogName, String dogColour) {
        this.name = dogName;
        this.colour = dogColour;
    }

    public void voice() {
        System.out.println("GAV GAV");
        System.out.println(this.colour);
    }
    public void changeColour(String newColour) {
        this.colour = newColour;
    }

}
