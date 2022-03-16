package student_yevgeniy_tolks.lesson_6.level_1;

class Task_2_WhileDef2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {    // "{" expected, was missing
            System.out.println(i);
            i++;
        }
    }
}
