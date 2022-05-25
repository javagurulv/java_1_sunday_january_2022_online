package student_ivan_sihovtsov.lesson_6.level_4.task_19;

public class WhileInfiniteLoopBreak {

    public static void main(String[] args) {

        int i = 1;
        while (i > 0) {
            System.out.println(i);
            i++;
            if (i==(100+1)){
                break;
            }
        }


    }
}