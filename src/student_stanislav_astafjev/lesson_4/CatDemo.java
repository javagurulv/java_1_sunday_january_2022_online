package student_stanislav_astafjev.lesson_4;

public class CatDemo {
    public static void main(String[] args) {
        Cat antares = new Cat(" Antares ",10);



        Cat juvi = new Cat(" Juvi ",10);

        antares.voice();
        juvi.voice();

        antares.voiceYourAge();
        antares.voiceYourName();

        juvi.voiceYourAge();
        juvi.voiceYourName();
    }
}
