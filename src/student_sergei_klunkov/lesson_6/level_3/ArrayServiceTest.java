package student_sergei_klunkov.lesson_6.level_3;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsTest();
        arrayServiceTest.notContainsTest();


    }

    public void containsTest(){
        ArrayService contains = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5, 6};
        boolean found = true;
        if (found == contains.contains(testArray,1)){
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST FAIL!");
        }
    }

    public void notContainsTest(){
        ArrayService contains = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5, 6};
        boolean found = true;
        if (found == contains.contains(testArray,10)){
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST FAIL!");
        }
    }

}
