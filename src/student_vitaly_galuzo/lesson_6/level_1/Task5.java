package student_vitaly_galuzo.lesson_6.level_1;

public class Task5 {

    public static void main(String[] args) {

        int i = 105;  //Oshibka v logike koda: Dekrement dolzen ponizatj peremennuju i na (1) poka ne dostignet 100!
        while (i >= 100) {
            System.out.println(i);
            i--;
        }
    }
}
