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
}
