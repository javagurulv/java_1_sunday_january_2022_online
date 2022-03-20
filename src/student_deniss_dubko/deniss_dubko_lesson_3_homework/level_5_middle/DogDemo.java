package student_deniss_dubko.deniss_dubko_lesson_3_homework.level_5_middle;

public class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Java", 5, "Brown");

        System.out.println("Task 18: ");
        dog.voiceYourName();
        dog.voiceYourName();
        dog.voiceYourName();

        System.out.println();
        System.out.println("Task 19: ");
        dog.voiceYourName();
        dog.voiceYourAge();

        System.out.println();
        System.out.println("Task 20: ");
        dog.voiceYourAge();
        dog.happyBirthday();

        System.out.println();
        System.out.println("Task 21: ");
        dog.voiceYourName();
        dog.voiceYourAge();
        dog.voiceYourColour();

        System.out.println();
        System.out.println("Task 22: ");
        dog.voiceYourColour();
        dog.changeColor("White");
    }


}