package student_stanislav_astafjev.lesson_2;

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


    public void voiceYourName() {

        System.out.println("Dog name is" + this.name);
    }

    public void voiceYourAge() {

        System.out.println("Dog age is" + this.age);
    }
}