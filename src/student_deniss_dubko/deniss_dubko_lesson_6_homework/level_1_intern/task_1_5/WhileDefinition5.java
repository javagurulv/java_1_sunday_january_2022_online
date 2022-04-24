package student_deniss_dubko.deniss_dubko_lesson_6_homework.level_1_intern.task_1_5;

/*
Найдите логическую ошибку в программе и исправить её.
Программа должна выводить числа от 1 до 100 на консоль.

class WhileDefinition5 {

    public static void main(String[] args) {
        int i = 1;
        while (i >= 100) {
            System.out.println(i);
            i--;
        }
    }

}
*/

class WhileDefinition5 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

}
