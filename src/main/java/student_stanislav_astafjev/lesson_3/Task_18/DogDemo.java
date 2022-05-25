package student_stanislav_astafjev.lesson_3.Task_18;

public class DogDemo {
    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik",10,"red");
        sharik.voiceYourName();
        sharik.voice();
        sharik.dogColor();
        sharik.voiceYourAge();
        System.out.println("Sharik celebrating birthday!");
        sharik.voice();
        String dogColor = sharik.dogColor;
        sharik.happyBirthday();
        sharik.changeColor("black");

    }
}
