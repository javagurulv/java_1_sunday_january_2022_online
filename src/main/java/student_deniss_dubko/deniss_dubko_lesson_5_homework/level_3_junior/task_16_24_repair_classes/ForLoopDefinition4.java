package student_deniss_dubko.deniss_dubko_lesson_5_homework.level_3_junior.task_16_24_repair_classes;

/*
Найдите логическую ошибку в программе и исправьте её:

class ForLoopDefinition4 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i--) {
            System.out.println(i);
        }
    }

}

PS: программа должна выводить на консоль числа от 0 до 9.
*/

class ForLoopDefinition4 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
