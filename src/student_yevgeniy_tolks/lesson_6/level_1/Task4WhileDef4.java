package student_yevgeniy_tolks.lesson_6.level_1;

class Task4WhileDef4 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;    /* increment should be located inside the loop while,
                     without that, loop will continue iterating */
        }
    }
}
