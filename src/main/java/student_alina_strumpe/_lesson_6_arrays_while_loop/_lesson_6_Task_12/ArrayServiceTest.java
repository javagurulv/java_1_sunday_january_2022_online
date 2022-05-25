package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_12;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.shouldFindNumberInArray();
        arrayServiceTest.notShouldFindNumberInArrayTest2();

    }


    public void shouldFindNumberInArray() {
        ArrayService contains = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5, 6};
        boolean found = true;
        if (found == contains.containsInArrayTheNumber(testArray, 1)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void notShouldFindNumberInArrayTest2() {
        ArrayService contains = new ArrayService();
        int[] testArray = {10, 20, 40, 50, 77};
        boolean found = true;
        if (found != contains.containsInArrayTheNumber(testArray, 100)){
            System.out.println("Test is OK");
        }else{
            System.out.println("Test is fail");
        }
    }
}


