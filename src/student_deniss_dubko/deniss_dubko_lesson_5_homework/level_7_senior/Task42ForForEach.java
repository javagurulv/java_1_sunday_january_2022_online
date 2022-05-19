package student_deniss_dubko.deniss_dubko_lesson_5_homework.level_7_senior;

class Task42ForForEach {

    public static void main(String[] args) {
        int[] array = {51, 136, 387};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int[] array2 = {51, 136, 387};

        for (int i : array2) {
            System.out.println(i);
        }
    }

}
