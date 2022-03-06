package student_ivan_sihovtsov.lesson3.level_5.task_20;

public class Dog {

    public String name;
    public int age;
    public int ageTwo;

    public Dog(String iniName, int iniAge) {

        name = iniName;
        age = iniAge;
        ageTwo = age + 1;
    }

    public void voice() {
        System.out.println("Hello, my name is " + name + " i'm " + age + " y.o.");
    }

    public void happyBirthday() {

        System.out.println("I celebrate my birthday!");
    }

    public void voiceTwo() {

        System.out.println("Hello, my name is " + name + " i'm " + ageTwo + " y.o.");

    }

}
