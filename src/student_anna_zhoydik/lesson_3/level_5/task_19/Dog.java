package student_anna_zhoydik.lesson_3.level_5.task_19;

public class Dog {
  int age;
  String name;

  Dog(int dogAge, String dogName) {
    this.age = dogAge;
    this.name = dogName;
  }

  public void voice() {
    System.out.println("My name is " + name + ", my age is " + age+" year(s)");
  }
}
