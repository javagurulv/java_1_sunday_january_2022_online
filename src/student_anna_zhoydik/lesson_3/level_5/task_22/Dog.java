package student_anna_zhoydik.lesson_3.level_5.task_22;

public class Dog {
  String name;
  String color;

  Dog(String dogsName, String dogsColor) {
    this.color = dogsColor;
    this.name = dogsName;
  }

  public void voice() {
    System.out.println("My name is " + this.name + ", my color is " + this.color);
  }

  public void changeColor(String newColor) {
    this.color = newColor;
  }
}
