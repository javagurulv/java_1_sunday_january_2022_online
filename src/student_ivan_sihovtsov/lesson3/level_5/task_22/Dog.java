package student_ivan_sihovtsov.lesson3.level_5.task_22;

public class Dog {

    private String color;

    public Dog(String dogColor) {
        this.color = dogColor;
    }

    public void voice() {
        System.out.println("Aff aff aff, my color is " + this.color + ".");
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }


}
