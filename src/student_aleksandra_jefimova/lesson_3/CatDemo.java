package student_aleksandra_jefimova.lesson_3;

public class CatDemo {

    public static void main(String[] args) {
        Cat pushok = new Cat( "Pushok",  2); //Aleksandra, tyt bila oshibochka, ispravil
        Cat rizhik = new Cat("Rizhik", 3);   // Alekandra, i tyt tozhe ispravil

        pushok.voice();
        rizhik.voice();

        pushok.voiceYourName();
        rizhik.voiceYourName();

        pushok.voiceYourAge();
        rizhik.voiceYourAge();
    }
}


