package student_stanislav_astafjev.lesson_3.Task_18;

 class Dog {
     String name;
     int age;
     String dogColor;

     Dog(String dogName, int dogAge,String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.dogColor = dogColor;
    }
     void voice() {
        System.out.println("AWWW AWWW AWWW");
    }
     void voiceYourName() {
         System.out.println("Dog name is " + this.name);
    }
     void voiceYourAge() {
        System.out.println("Dog age is " + this.age);
    }
    void dogColor() {
         System.out.println("Dog color is " + this.dogColor);
    }
    void happyBirthday(){
         this.age = this.age+1;
         System.out.println(age + " years");
    }
    void changeColor(String newColor) {
         this.dogColor = newColor;
         System.out.println("Change color to " + newColor);
    }
}