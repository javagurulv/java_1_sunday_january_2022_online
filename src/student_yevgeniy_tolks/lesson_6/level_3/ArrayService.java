package student_yevgeniy_tolks.lesson_6.level_3;

class ArrayService {


    boolean contains(int[] array, int numberToSearch) {
        boolean numberFound = false;

        for (int i = 0; i < array.length; i++) {
            if (numberToSearch == array[i]) {
                numberFound = true;
                break;
            }
        }
        return numberFound;
    }

    public int countOccurrence(int[] array, int countSameNumbers) {
        int countNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (countSameNumbers == array[i]) {
                countNumbers++;
            }
        }
        return countNumbers;
    }
}




