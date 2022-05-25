package student_jelena_voinica;

public class FrogDemo {

    public static void main (String[] args) {

        Frog zetta  = new Frog ("Zetta",10);
        Frog nana = new Frog ("Nana",9);

        zetta.voice();
        nana.voice();

       zetta.voiceYourname();
       nana.voiceYourname();

       zetta.voiceYourAge();
       nana.voiceYourAge();

    }



}
