package student_stanislav_astafjev.lesson_3.Task_18;

 class Dog {
     String name;
     int age;
     Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;
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
    void happyBirthday(){
         this.age = this.age+1;
         System.out.println(age + " years");
    }
}