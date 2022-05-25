package student_aleksandrs_padalko.lesson_3.level_5.task_22;

class Dog {  private String name; private String color;
    String color1;

     Dog(String dogName, String dogColor, String newColor) {
        this.name = dogName;
        this.color = dogColor;
        this.color1 = newColor;
    }

     void voice() {

        System.out.println("My name is "+ this.name);
    }

 void color() { System.out.println("I am "+this.color);}
    public void changeColor() {

        System.out.println("I have changed color to "+this.color1);
    }
}
