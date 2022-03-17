package student_yevgeniy_tolks.lesson_6.level_3;

class ArrayService {


    boolean contains(int[] array, int numberToSearch) {
        boolean numberFound = false;

        for (int j : array) {
            if (numberToSearch == j) {
                numberFound = true;
                break;
            }
        }
        return numberFound;
    }

    public int countOccurrence(int[] array, int countSameNumbers) {
        int countNumbers = 0;
        for (int j : array) {
            if (countSameNumbers == j) {
                countNumbers++;
            }
        }
        return countNumbers;
    }
}




