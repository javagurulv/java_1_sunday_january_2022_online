package student_yevgeniy_tolks.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.arrayNumberFoundTest();
        arrayServiceTest.arrayNumberNotFoundTest();
        arrayServiceTest.countOccurrenceTest();
        arrayServiceTest.countNoOccurrenceTest();
        arrayServiceTest.firstArrayNumberChangedTest();
        arrayServiceTest.firstArrayNumberNotChangedTest();
        arrayServiceTest.changedAllTest();
        arrayServiceTest.nothingChangedTest();
        arrayServiceTest.turnOverArrayTest();
        arrayServiceTest.sortArrayTest();
    }

    public void arrayNumberFoundTest() {

        ArrayService arrayService = new ArrayService();
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 15;
        arr[4] = 13;

        boolean resultNumberSearch = arrayService.contains(arr, 7);
        System.out.println(Arrays.toString(arr));

        if (resultNumberSearch) {
            System.out.println("Searched number found -  Test OK");
        } else {
            System.out.println("Searched file was not found  - Test FAILED");
        }
    }

    public void arrayNumberNotFoundTest() {
        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 1;
        arr[4] = 15;

        ArrayService arrayService = new ArrayService();
        boolean resultNumberSearch = arrayService.contains(arr, 8);
        System.out.println(Arrays.toString(arr));

        if (!resultNumberSearch) {
            System.out.println("Searched number not found -  Test OK");
        } else {
            System.out.println("Searched number found  - Test FAILED");
        }
    }

    public void countOccurrenceTest() {
        int[] arr = new int[5];
        arr[0] = 17;
        arr[1] = 2;
        arr[2] = 12;
        arr[3] = 17;
        arr[4] = 17;

        int countOccurredNumbers = 3;

        ArrayService arrayService = new ArrayService();
        int resultOccurredNumber = arrayService.countOccurrence(arr, 17);
        System.out.println(Arrays.toString(arr));
        if (resultOccurredNumber == countOccurredNumbers) {
            System.out.println(" Occurrence found " + resultOccurredNumber + " times - Test OK");
        } else {
            System.out.println("No occurrence - Test failed");
        }
    }

    public void countNoOccurrenceTest() {
        int[] arr = new int[5];
        arr[0] = 16;
        arr[1] = 2;
        arr[2] = 12;
        arr[3] = 13;
        arr[4] = 9;

        ArrayService arrayService = new ArrayService();
        int resultOccurredNumber = arrayService.countOccurrence(arr, 1);
        System.out.println(Arrays.toString(arr));
        if (resultOccurredNumber == 0) {
            System.out.println("No Occurrence found - Test OK");
        } else {
            System.out.println("Occurrence found - Test failed");
        }
    }

    public void firstArrayNumberChangedTest() {
        int[] arr = new int[5];
        arr[0] = 16;
        arr[1] = 2;
        arr[2] = 17;
        arr[3] = 13;
        arr[4] = 9;


        ArrayService arrayService = new ArrayService();
        boolean resultFirstNumber = arrayService.changeFirstArrayNumber(arr, 16, 3);
        if (resultFirstNumber) {
            System.out.println("First array number changed - Test OK");

        } else {
            System.out.println("First array number not changed - Test FAILED");
        }
    }

    public void firstArrayNumberNotChangedTest() {
        int[] arr = new int[5];
        arr[0] = 16;
        arr[1] = 2;
        arr[2] = 17;
        arr[3] = 13;
        arr[4] = 9;


        ArrayService arrayService = new ArrayService();
        boolean resultFirstNumber = arrayService.changeFirstArrayNumber(arr, 16, 16);
        if (!resultFirstNumber) {
            System.out.println("First array number not changed - Test OK");

        } else {
            System.out.println("First array number changed - Test FAILED");
        }
    }

    public void changedAllTest() {
        int[] arr = new int[5];
        arr[0] = 19;
        arr[1] = 2;
        arr[2] = 16;
        arr[3] = 11;
        arr[4] = 16;


        ArrayService arrayService = new ArrayService();
        int resultOfOccurrence = arrayService.changeAll(arr, 16, 4);
        if (resultOfOccurrence > 0) {

            System.out.println("Changed all repeating numbers - Test OK");
        } else {
            System.out.println("All numbers are different - Test FAILED");
        }

    }

    public void nothingChangedTest() {
        int[] arr = new int[5];
        arr[0] = 19;
        arr[1] = 2;
        arr[2] = 13;
        arr[3] = 16;
        arr[4] = 1;


        ArrayService arrayService = new ArrayService();
        int resultOfOccurrence = arrayService.changeAll(arr, 14, 4);
        if (resultOfOccurrence == 0) {

            System.out.println("Nothing was changed in array - Test OK");
        } else {
            System.out.println("Changes done in array - Test FAILED");
        }
    }

    public void turnOverArrayTest() {
        int[] arr = new int[6];
        arr[0] = 19;
        arr[1] = 2;
        arr[2] = 13;
        arr[3] = 16;
        arr[4] = 1;
        arr[5] = 21;

        int[] arrTurned = new int[6];
        arrTurned[0] = 21;
        arrTurned[1] = 1;
        arrTurned[2] = 16;
        arrTurned[3] = 13;
        arrTurned[4] = 2;
        arrTurned[5] = 19;

        ArrayService arrayService = new ArrayService();
        arrayService.turnOverArray(arr);
        System.out.println(Arrays.toString(arr));
        if (Arrays.equals(arr, arrTurned)) {
            System.out.println("Array reversed  - TEST OK");

        } else {
            System.out.println("Array not reversed - FAILED ");
        }
    }

    public void sortArrayTest() {   //ascending sorting of array
        int[] arr = new int[6];
        arr[0] = 19;
        arr[1] = 2;
        arr[2] = 13;
        arr[3] = 16;
        arr[4] = 1;
        arr[5] = 21;

        int[] arrSortAscend = new int[6];
        arrSortAscend[0] = 1;
        arrSortAscend[1] = 2;
        arrSortAscend[2] = 13;
        arrSortAscend[3] = 16;
        arrSortAscend[4] = 19;
        arrSortAscend[5] = 21;

        ArrayService arrayService = new ArrayService();
        arrayService.sortArray(arr);
        if (Arrays.equals(arr, arrSortAscend)) {
            System.out.println("Array ascending sort - TEST OK");
        } else {
            System.out.println("Array ascending sort - FAILED ");
        }
    }


}