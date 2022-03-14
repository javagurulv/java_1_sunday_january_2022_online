package student_anna_zhoydik.lesson_3.level_5.task_22;

 class Dog {
  String name;
  String color;

  Dog(String dogsName, String dogsColor) {
    this.color = dogsColor;
    this.name = dogsName;
  }

   void voice() {
    System.out.println("My name is " + this.name + ", my color is " + this.color);
  }

   void changeColor(String newColor) {
    this.color = newColor;
  }
}
