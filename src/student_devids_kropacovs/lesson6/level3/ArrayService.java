package student_devids_kropacovs.lesson6.level3;

public class ArrayService {

    boolean contains(int[] arr, int numberToSearch){
        for ( int i = 0; i<arr.length; i++ ){
            if (arr[i] == numberToSearch){
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch){
        int result = 0;
        for( int i = 0; i< arr.length; i++){
            if (arr[i] == numberToSearch){
                result++;
            }
        }
            return result;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber){
        for( int i = 0; i< arr.length; i++){
            if (arr[i] == numberToReplace){
                arr[i] = newNumber;
                return  true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber){
        int replacedNumbers = 0;
        for( int i = 0; i< arr.length; i++){
            if (arr[i] == numberToReplace){
                arr[i] = newNumber;
                replacedNumbers++;
            }
        }
        return replacedNumbers;
    }
//    int[] arr= {6, 4, 8, 1, 9, 21, 3};

    void sort(int[] arr){
        int helper1;
        for( int i = 0; i<arr.length; i++){
            for ( int j = 0; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    helper1 = arr[j];
                    arr[j] = arr[i];
                    arr[i] = helper1;
                }
            }
        }
    }
}



