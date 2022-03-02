package student_yevgeniy_tolks.lesson_3.level_3;

class Robot {
    String name;

//creating constructor of Class Robot to give the name for every virtual object name
     Robot(String name) {
        this.name = name;
    }

    void sayHello(){
        System.out.print("Hello! ");
    }
    void sayYourName(){
        System.out.println("My name is "+ this.name);
    }

}
