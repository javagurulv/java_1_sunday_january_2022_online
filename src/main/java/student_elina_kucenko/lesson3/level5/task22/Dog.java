package student_elina_kucenko.lesson3.level5.task22;

class Dog {

    String name;
        int age;
    String color;


    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color=color;

    }
    void changeColor(String newColor) {
        color=newColor;

    }

    public void voice() {
        System.out.println("My nam is "+name + "! I am "+age+" years old!"+" My color is "+color+"!");

    }
}



