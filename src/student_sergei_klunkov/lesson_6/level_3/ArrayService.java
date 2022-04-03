package student_sergei_klunkov.lesson_6.level_3;

import java.util.Arrays;

class ArrayService {

    public boolean contains(int[] array, int numbersToSearch){

        boolean found = false;

        for(int element : array){
            if (element == numbersToSearch){
                found = true;
                break;
            }
        }
        System.out.println(found);
        return found;
    }

    public int countOccurrences(int[] array, int numberToSearch){

        int count = 0;
        for(int numberInArray : array)
            if(numberToSearch == numberInArray){
                count++;
            }
        return count;
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int[] fillArray( int[] array, int numbers) {
        for(int i=0;i< array.length;i++){
            array[i] = numbers;
        }
        return array;
    }

    public boolean replaceFirst(int[] array, int numberToReplace, int newNumber){
        boolean replace = false;
        for ( int i = 0; i < array.length; i++){

            if(array[0] == numberToReplace){
                array[0] = newNumber;
                return true;
            }
        }
        return replace;
    }


    public int replaceAll(int[] array, int numberToReplace, int newNumber){
        int replace = 0;
        for ( int i = 0; i < array.length; i++){
            if(array[i] == numberToReplace){
                array[i] = newNumber;
                replace++;
            }
        }
        return replace;
    }

    public void revert(int[] array){
        for (int left = 0, right = array.length - 1; left < right; left ++, right --){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

        }
    }

    public void sorting(int[] array){
        Arrays.sort(array);
        for( int i = 0; i<array.length; i++);

    }

}

