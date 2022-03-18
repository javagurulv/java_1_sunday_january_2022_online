package student_vitaly_galuzo.my_code;

public class Human {

    String name;
    int age;
    int weight;
    String lastname;


    public Human(String name, int age, int weight, String lastname) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.lastname = lastname;

    }

    public String getName(String name, String lastname) {
        return name + lastname;

    }

    public int getAge() {
        return this.age;
    }

    public int getNewAge() {
        this.age = this.age + 1;
        return this.age;
    }





    public int getWeight() {
        return this.weight;

    }

    public int getNewWeight() {
        this.weight = this.weight - 5;
        return this.weight;


    }
}