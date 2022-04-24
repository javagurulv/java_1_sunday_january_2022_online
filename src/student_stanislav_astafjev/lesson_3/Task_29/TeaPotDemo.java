package student_stanislav_astafjev.lesson_3.Task_29;

public class TeaPotDemo {
    public static void main(String[] args) {
        TeaPot phillips = new TeaPot("Phillips","Black",1);
        phillips.voiceYourBrand();
        phillips.voiceYourColor();
        phillips.voiceYourTimer();
        TeaPot bosch = new TeaPot("Bosch","red",2);
        bosch.voiceYourBrand();
        bosch.voiceYourColor();
        bosch.voiceYourTimer();
        TeaPot javaguru = new TeaPot("JavaGuru","orange",1);
        javaguru.voiceYourBrand();
        javaguru.voiceYourColor();
        javaguru.voiceYourTimer();
    }
}
