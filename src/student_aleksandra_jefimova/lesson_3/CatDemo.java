package student_aleksandra_jefimova.lesson_3;

public class CatDemo {

    public static void main(String[] args) {
        Cat pushok = new Cat(catName: "Pushok", catAge: 2);
        Cat rizhik = new Cat(catName: "Rizhik", catAge: 3);

        pushok.voice();
        rizhik.voice();

        pushok.voiceYourName();
        rizhik.voiceYourName();

        pushok.voiceYourAge();
        rizhik.voiceYourAge();
    }
}


