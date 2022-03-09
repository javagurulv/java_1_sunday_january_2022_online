package student_alina_strumpe._lesson_3._level_2_middle_Task_21;

public class DogDemo {

    public static void main(String[] args){

        Dog dog = new Dog("Better", 1,"Black");
        String dogName = dog.getDogName();
        int dogAge = dog.getDogAge();
        String dogColor = dog.getDogColor();
        dog.voiceVoice();

        System.out.println(dogName);
        System.out.println(dogAge);
        System.out.println(dogColor);
    }
}
