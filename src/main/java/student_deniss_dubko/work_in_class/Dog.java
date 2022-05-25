package student_deniss_dubko.work_in_class;

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
        System.out.println("My name is " + this.name);
    }

    public void voiceYourAge() {
        System.out.println("My age is " + this.age);
    }


    }
