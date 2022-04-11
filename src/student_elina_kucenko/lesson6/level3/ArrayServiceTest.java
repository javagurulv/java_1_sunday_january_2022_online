package student_elina_kucenko.lesson6.level3;

import java.util.Arrays;

class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.numberIsInArray();
        arrayServiceTest.numberIsNotInArray();
        arrayServiceTest.countOccurencies();
        arrayServiceTest.NoOccurencies();
        arrayServiceTest.changeFirstOccurenceTest();
        arrayServiceTest.noFirstOccurenceTest();
        arrayServiceTest.changeAllOccurenceTest();
        arrayServiceTest.noOccurenceToChangeTest();
        arrayServiceTest.revertedArrayTest();
        arrayServiceTest.sortArrayTest();
        arrayServiceTest.sortArraySystemTest();

    }

    public void numberIsInArray() {
        int[] array = {10, 12, 23, 56, 9};
        if (arrayService.checkIfNumberIsInArray(9, array)) {
            System.out.println("Number is in Array - OK");
        } else {
            System.out.println("Number in Array - false");
        }
    }

    public void numberIsNotInArray() {
        int[] array = {10, 12, 23, 56, 9};
        if (!arrayService.checkIfNumberIsInArray(7, array)) {
            System.out.println("Number is NOT in Array - OK");
        } else {
            System.out.println("Number is NOT in Array - false");
        }
    }

    public void countOccurencies() {
        int[] array = {12, 4, 56, 8, 8, 88};
        int timesRepeated = 2;
        if (arrayService.checkHowManyTimesNumberIsInArray(8, array) == timesRepeated) {
            System.out.println("Number is repeated " + timesRepeated + " times in array - OK");
        } else {
            System.out.println("Number is repeated " + timesRepeated + " times - failed");
        }
    }

    public void NoOccurencies() {
        int[] array = {12, 4, 56, 8, 8, 88};
        if (arrayService.checkHowManyTimesNumberIsInArray(6, array) == 0) {
            System.out.println("Number is repeated 0 times in array - OK");
        } else {
            System.out.println("Number is repeated 0 times in array - failed");
        }
    }

    public void changeFirstOccurenceTest() {
        int[] array = {34, 12, 11, 7, 90, 45};
        if (arrayService.changeFirstOccurence(34, array, 6)) {
            System.out.println("Number first appearance is changed 1x time - OK");
        } else {
            System.out.println("Number first appearance is changed 1x time - failed");
        }
    }

    public void noFirstOccurenceTest() {
        int[] array = {34, 12, 11, 7, 90, 45};
        if (!arrayService.changeFirstOccurence(15, array, 0)) {
            System.out.println("Number first appearance is missing - OK");
        } else {
            System.out.println("Number first appearance is missing - failed");
        }
    }

    public void changeAllOccurenceTest() {
        int[] array = {34, 12, 11, 7, 11, 45, 11};
        int occurenceNumber = 3;
        if (arrayService.changeAllOccurencies(11, array, 3) == occurenceNumber) {
            System.out.println("Number appearance " + occurenceNumber + " times in array - OK");
        } else {
            System.out.println("Number appearance " + occurenceNumber + " times in array - failed");
        }
    }

    public void noOccurenceToChangeTest() {
        int[] array = {34, 12, 11, 7, 11, 45, 11};
        if (arrayService.changeAllOccurencies(19, array, 0) == 0) {
            System.out.println("Number appearance is missing - OK");
        } else {
            System.out.println("Number appearance is missing - failed");
        }
    }

    public void revertedArrayTest() {
        int[] array = {1, 2, 3, 4, 5};
        arrayService.revertArray(array);
        if (array[0] == 5 && array[1] == 4 && array[2] == 3 && array[3] == 2 && array[4] == 1) {
            System.out.println("Reverted array - OK");
        } else {
            System.out.println("Reverted array - failed");
        }
    }

    public void sortArrayTest() {
        int[] array = {6, 34, 98, 12};
        arrayService.sortArray(array);
        if (array[0] == 6 && array[1] == 12 && array[2] == 34 && array[3] == 98) {
            System.out.println("Array sorted - OK");
        } else {
            System.out.println("Array sorted - failed");
        }
    }

    public void sortArraySystemTest() {
        int[] arrayForSorting = {13, 4, 5, 6, 7};
        int[] arrayExpectedAfterSorting = {4, 5, 6, 7, 13};
        System.out.println();
        if (Arrays.equals(arrayExpectedAfterSorting, arrayService.sortingArrayAuto(arrayForSorting))) {
            System.out.println("Sorted array system Test - OK");

        } else {
            System.out.println("Sorted array system Test - OK");
        }
    }
}

