package student_anna_zhoydik.lesson_3.level_5.task_21;

public class Dog {

  String name;
  String color;
  int age;

  Dog(String dogsName, int dogsAge, String dogsColor) {
    this.name = dogsName;
    this.color = dogsColor;
    this.age = dogsAge;
  }

  public void voice() {
    System.out.println("My name is " + this.name + ", my age is " + this.age + ", my color is " + this.color);
  }
}
