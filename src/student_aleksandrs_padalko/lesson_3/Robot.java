package student_aleksandrs_padalko.lesson_3;

//Создайте класс робот (Robot).
//
//Научите вашего робота "говорить" привет.
//
//Создайте в классе Robot метод со следующей сигнатурой:
//
//    public void sayHello() {
//        // тут напишите команду распечатки на консоли строки "Hello!"
//    }

public class Robot {

    private String name;


    public Robot(String robotName) {
        this.name = robotName;

    }

    public void voice() {
    System.out.println("Hello!");
    }

    public void voiceYourName() {
        System.out.println("My name is " + this.name);
    }



}
