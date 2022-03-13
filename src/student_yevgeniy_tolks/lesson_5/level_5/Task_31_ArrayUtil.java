package student_yevgeniy_tolks.lesson_5.level_5;

class Task_31_ArrayUtil {

    public int[] createArray(int arrayLenght) {
        return new int[arrayLenght];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }
}

