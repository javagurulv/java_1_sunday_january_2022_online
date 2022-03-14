package student_ivan_sihovtsov.lesson3.level_5.task_21;

public class Dog {

    public String name;
    public int age;
    public String color;

    public Dog(String iniName, int iniAge) {

        name = iniName;
        age = iniAge;
    }

    public void voice() {
        System.out.print("Hello, my name is " + name + ", i'm " + age + " y.o." + " and my color is ");

    }

}
