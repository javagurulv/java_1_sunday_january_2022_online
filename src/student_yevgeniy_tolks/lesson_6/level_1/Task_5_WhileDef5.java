package student_yevgeniy_tolks.lesson_6.level_1;

class Task_5_WhileDef5 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {             /*if (i>=100) this statement always false, nothing will be
                                       printed out on the console*/

            System.out.println(i);
            i++;                     //instead of decrement should be increment
        }
    }
}
