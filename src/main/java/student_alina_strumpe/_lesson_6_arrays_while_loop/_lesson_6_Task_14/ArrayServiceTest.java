package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_14;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldReplaceFirstElement();
        test.shouldNotReplaceFirstElement();
    }

    public void shouldReplaceFirstElement() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = new int[3];
        boolean replace = true;
        arrayService.fillArray(testArray, 1);
        boolean actualResult = arrayService.replaceFirstElementInArray(testArray, 1, 13);
        if (actualResult == replace) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }
    }


    public void shouldNotReplaceFirstElement() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = new int[4];
        boolean replace = true;
        arrayService.fillArray(testArray, 100);
        boolean actualResult = arrayService.replaceFirstElementInArray(testArray, 200, 10);
        if (actualResult != replace) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }
    }
}







