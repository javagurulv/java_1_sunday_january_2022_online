package student_sergei_klunkov.lesson_3;

public class Dog {

     private String name;
     private int age;

     public Dog(String dogName, int dogAge) {

          this.name = dogName;
          this.age = dogAge;

}


     public static void main(String[] args) {

     }

     public void voice() {
          System.out.println("Gaf Gaf Gaf");
     }
     public void voiceYourName() {
          System.out.println("My name is " + this.name);
     }

}
