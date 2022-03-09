package student_alina_strumpe._lesson_3._level_2_middle_Task_22;

public class DogDemo {

    public static void main(String[] args){

        Dog dog = new Dog("Grey");

        String dogColor = dog.getColor();
        String newDogColor = dog.changeColor("Black");

        dog.voiceVoice();
        System.out.println("I change my color "+ dogColor+ " to black.");
        dog.voiceVoice();
        System.out.println("I'm "+ newDogColor + " color now.");
    }
}
