package student_ivan_sihovtsov.lesson_6.level_4.task_19;

public class ForInfiniteLoopBreak {

    public static void main(String[] args) {

        for (int i = 0; i >= 0; i++) {
            System.out.println(i);
            if (i==100){
                break;
            }
        }

    }

}
