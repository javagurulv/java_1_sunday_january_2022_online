package student_stanislav_astafjev.lesson_3;

import teacher.lesson_3_oop_first_look.lessoncode.Dog;

public class DogDemo {
    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik", 10);

        Dog pupsik = new Dog("Pupsik", 9);

        sharik.voice();

        pupsik.voice();

        sharik.voiceYourName();

        pupsik.voiceYourName();


        sharik.voiceYourAge();

        pupsik.voiceYourAge();


    }


}