package student_yevgeniy_tolks.lesson_6.level_4.task_20;

public class WhileLoopContinue {
    public static void main(String[] args) {

        int number = 10;
        while (number < 20) {
            if (number % 3 == 0) {
                number++;
                continue;

            }
            System.out.println(number);
            number++;
        }
    }
}
