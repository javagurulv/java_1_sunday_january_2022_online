package student_deniss_dubko.deniss_dubko_lesson_5_homework.level_5_6_middle.task_31_38;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int arrayElements : array) {
            System.out.println(arrayElements + " ");
        }
    }

    public  int findMaxNumber(int[] array) {
        int maxArrayElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxArrayElement) {
                maxArrayElement = array[i];
            }
        }
        return maxArrayElement;
    }

    public int findMinNumber(int[] array) {
        int minArrayElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minArrayElement) {
                minArrayElement = array[i];
            }
        }
        return minArrayElement;
    }

}
