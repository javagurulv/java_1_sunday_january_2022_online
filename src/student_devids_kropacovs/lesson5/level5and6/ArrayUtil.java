package student_devids_kropacovs.lesson5.level5and6;

public class ArrayUtil {
    int[]numbers;

    public int[] createArray(int arraySize){
        return this.numbers = new int[arraySize];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i< array.length; i++){
            numbers[i] = (int) (Math.random() * 10 +1);
        }
    }

    public void printArrayToConsole(int[] array) {
        for ( int i = 0; i< array.length; i++){
            System.out.println("Number " + (i+1) + " of an array is " + array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int biggestNumber = array[0];
        for ( int i = 0; i< array.length; i++){
            if (numbers[i] > biggestNumber){
                biggestNumber = numbers[i];
            }
        }
        return biggestNumber;
    }

    public int findMinNumber(int[] array) {
        int smallestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
            }
        }
        return smallestNumber;
    }
}
