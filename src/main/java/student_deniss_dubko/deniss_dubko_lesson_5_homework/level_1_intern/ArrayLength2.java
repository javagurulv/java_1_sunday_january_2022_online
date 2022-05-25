package student_deniss_dubko.deniss_dubko_lesson_5_homework.level_1_intern;

/*
Найдите ошибку в программе и исправить её:

class ArrayLength2 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }

}
 */

class ArrayLength2 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[1]);
    }
}
