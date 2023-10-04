package student_deniss_dubko.practice.lesson_3_oop.dog;

class Dog {

    private String name;
    private int age;

    public Dog(String dogName,
               int dogAge) {
        this.name = dogName;
        this.age = dogAge;
    }

    public void voice() {
        System.out.println(this.name + ", " + this.age);
    }

    void happyBirthday() {
        this.age = this.age + 1;
        System.out.println("Happy " + this.age + " Birthday!");
    }

}