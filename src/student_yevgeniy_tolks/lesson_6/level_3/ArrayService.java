package student_yevgeniy_tolks.lesson_6.level_3;

import java.util.Arrays;

class ArrayService {


    boolean contains(int[] array, int numberToSearch) {
        boolean numberFound = false;

        for (int arr : array) {
            if (numberToSearch == arr) {
                numberFound = true;
                break;
            }
        }
        return numberFound;
    }

    public int countOccurrence(int[] array, int countSameNumbers) {
        int countNumbers = 0;
        for (int arr : array) {
            if (arr == countSameNumbers) {
                countNumbers++;
            }
        }
        return countNumbers;
    }

    boolean changeFirstArrayNumber(int[] array, int firstArrayNumber,
                                   int newNumber) {
        boolean changedFirst = false;
        for (int i = 0; i < array.length; i++) {
            if (array[0] == firstArrayNumber && firstArrayNumber != newNumber) {
                changedFirst = true;
                break;
            }

        }
        return changedFirst;
    }

    public int changeAll(int[] array, int currentNumber, int newNumber) {
        int countOccurrence=0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == currentNumber && currentNumber != newNumber) {
                array[i] = newNumber;
                countOccurrence++;
            }
          }
        return countOccurrence;
    }
}




