package student_elina_kucenko.lesson6.level4.task20;

public class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
