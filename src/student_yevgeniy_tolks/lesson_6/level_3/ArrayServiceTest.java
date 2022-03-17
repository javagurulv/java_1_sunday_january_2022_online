package student_yevgeniy_tolks.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.arrayNumberFoundTest();
        arrayServiceTest.arrayNumberNotFoundTest();
        arrayServiceTest.countOccurrenceTest();
        arrayServiceTest.countNoOccurrenceTest();
    }

    public void arrayNumberFoundTest() {

        ArrayService arrayService = new ArrayService();
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 15;
        arr[4] = 13;

        boolean numberSearch = arrayService.contains(arr, 7);
        System.out.println(Arrays.toString(arr));

        if (numberSearch) {
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
        boolean numberSearch = arrayService.contains(arr, 8);
        System.out.println(Arrays.toString(arr));

        if (!numberSearch) {
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
        int occurredNumber = arrayService.countOccurrence(arr, 17);
        System.out.println(Arrays.toString(arr));
        if (occurredNumber == countOccurredNumbers) {
            System.out.println(" Occurrence found " + occurredNumber + " times - Test OK");
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
        int occurredNumber = arrayService.countOccurrence(arr, 1);
        System.out.println(Arrays.toString(arr));
        if (occurredNumber == 0) {
            System.out.println("No Occurrence found - Test OK");
        } else {
            System.out.println("Occurrence found - Test failed");
        }
    }
}
