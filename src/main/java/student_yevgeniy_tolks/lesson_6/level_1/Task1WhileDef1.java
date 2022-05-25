package student_yevgeniy_tolks.lesson_6.level_1;

class Task1WhileDef1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {    // "(" parentheses was missing
            System.out.println(i);
            i++;
        }
    }
}
