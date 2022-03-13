package student_alina_strumpe._lesson_3._level_2_middle_Task_20;

public class DogDemo {

    public static void main(String[] args){

        Dog whiteDog = new Dog(5);
        whiteDog.voiceVoice();
        whiteDog.happyBirthday();
        whiteDog.voiceVoice();
        int newDogAge = whiteDog.calculateDogAge(0);
        System.out.println(newDogAge);
    }
}
