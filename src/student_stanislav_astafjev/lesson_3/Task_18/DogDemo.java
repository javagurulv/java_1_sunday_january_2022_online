package student_stanislav_astafjev.lesson_3.Task_18;

public class DogDemo {
    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik",10);
        sharik.voiceYourName();
        sharik.voice();

        sharik.voiceYourAge();
        System.out.println("Sharik celebrating birthday!");
        sharik.voice();
        sharik.happyBirthday();

    }
}
