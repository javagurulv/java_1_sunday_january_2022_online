package student_aleksandra_jefimova.lesson_3;

class Cat {

    private String name;
    private int age;

    public Cat (String catName, int catAge) {
        this.name = catName;
        this.age = catAge;
    }

    public void voice() {
        System.out.println("Meow Meow!");
    }

    public void voiceYourName() {
        System.out.println("My name is " + this.name);
    }

    public void voiceYourAge() {
        System.out.println("My age is " + this.age);
    }

}
