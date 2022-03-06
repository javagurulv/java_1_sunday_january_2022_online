package student_sergei_klunkov.lesson_3.lessoncode;

import student_sergei_klunkov.lesson_3.lessoncode.Dog;

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
