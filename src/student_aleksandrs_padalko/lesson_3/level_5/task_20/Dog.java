package student_aleksandrs_padalko.lesson_3.level_5.task_20;

public class Dog {
    private String name;
    private int age;


    public Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;

    }

    public void voice() {

        System.out.println("Gaf Gaf Gaf");
    }


    public void voiceYourAge() {
        System.out.println("I am " + this.age + " years old");
    }

    public void happyBirthday() {
        System.out.println( "Happy Birthday,  I am " + (this.age = this.age + 1)+ " years old now");
    }

}
