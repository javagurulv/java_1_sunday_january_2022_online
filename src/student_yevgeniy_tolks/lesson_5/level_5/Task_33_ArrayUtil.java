package student_yevgeniy_tolks.lesson_5.level_5;

class Task_33_ArrayUtil {

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }
}
