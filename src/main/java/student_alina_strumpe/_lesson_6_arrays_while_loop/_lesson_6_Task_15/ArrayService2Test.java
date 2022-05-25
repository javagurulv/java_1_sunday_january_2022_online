package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_15;

class ArrayService2Test {

    public static void main(String[] args) {

        ArrayService2Test arrayService2Test = new ArrayService2Test();
        arrayService2Test.shouldReplaceAllNumbers();
        arrayService2Test.shouldNotReplaceAllNumbers();
        arrayService2Test.fillArrayTest();
    }

    public void shouldReplaceAllNumbers() {
        ArrayService2 array1 = new ArrayService2();
        int[] testArray = new int[3];
        int actualResult = array1.replaceALL(testArray, 6, 10);
        check(10, actualResult, "Should Replace All Numbers");

       /* int newNumber = 10;
        if(newNumber == array1.replaceALL(testArray,6,10)){
            System.out.println("Test is Ok");
        } else {
            System.out.println("Test is FAIL");
        }*/
    }

    public void shouldNotReplaceAllNumbers() {
        ArrayService2 array2 = new ArrayService2();
        int[] testArray = new int[4];
        int actualResult = array2.replaceALL(testArray, 10, 16);
        check2(15, 16, "Sould NOT Replace ALL numbers");
     /*   int newNumber = 15;
        if(newNumber != array2.replaceALL(testArray,10,16)){
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }*/
    }

    public void fillArrayTest() {
        ArrayService2 array1 = new ArrayService2();
        int[] testArray = array1.createArray(3);
        array1.fillArray(testArray, 78);
        if (testArray[0] == 78) {
            System.out.println("Test Fill Array is OK");
        } else {
            System.out.println("Test Fill Array is FAIL");
        }
    }

    public void check(int newNumber, int actualResult, String testName) {
        ArrayService2 array1 = new ArrayService2();
        if (newNumber == actualResult) {
            System.out.println("Test " + testName + " is OK");
        } else {
            System.out.println("Test " + testName + "is FAIL");
        }
    }

    public void check2(int newNumber, int actualResult, String testName) {
        ArrayService2 array2 = new ArrayService2();
        if (newNumber != actualResult) {
            System.out.println("Test " + testName + " is OK");
        } else {
            System.out.println("Test " + testName + "is FAIL");
        }
    }

}
