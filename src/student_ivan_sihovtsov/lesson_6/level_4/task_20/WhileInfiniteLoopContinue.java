package student_ivan_sihovtsov.lesson_6.level_4.task_20;

public class WhileInfiniteLoopContinue {

    public static void main(String[] args) {

        int i = 1;
        while (i > 0) {
            i++;
            if (i == 45){
                continue;
            }
            if (i==(100+1)){
                break;
            }
            System.out.println(i);
        }


    }
}