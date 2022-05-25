package student_aleksandra_jefimova.lesson_3.level_7.task_29;

class Bird {
    String name;
    private int months;

    public Bird (String birdName, int birdMonths) {
        this.name = birdName;
        this.months = birdMonths;
    }

    public void voice() {
        System.out.println("Chirik!");
    }

    public void voiceYourName() {
        System.out.println("My name is " + this.name);
    }

    public void voiceYourMonths() {
        System.out.println("I am " + this.months + " months old");
    }

}
