package student_elina_kucenko.lesson3.level5.task20;

class Dog {

    String name;
    int age;


    public Dog(String name, int dogAge) {
        this.name = name;
        this.age = dogAge;

    }
    public void voice() {
        System.out.println("My name is "+name + "! I am " + age + " years old");
    }

    public void happyBirthday() {
        age = age + 1;
    }
    }



