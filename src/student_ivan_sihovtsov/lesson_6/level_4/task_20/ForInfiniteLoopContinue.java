package student_ivan_sihovtsov.lesson_6.level_4.task_20;

public class ForInfiniteLoopContinue {

    public static void main(String[] args) {

        for (int i = 0; i >= 0; i++) {

            if (i == 5){
                continue;
            }
            if (i==100){
                break;
            }
            System.out.println(i);
        }

    }

}
