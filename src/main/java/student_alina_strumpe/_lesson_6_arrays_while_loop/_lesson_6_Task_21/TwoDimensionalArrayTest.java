package student_alina_strumpe._lesson_6_arrays_while_loop._lesson_6_Task_21;

public class TwoDimensionalArrayTest {

    public static void main(String[] args){

        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.sumArrayPositiveTest();
        test.sumArrayNegativeTest();

    }

    public void sumArrayPositiveTest(){
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] testArray = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
        int expectedResult = 12;
        if(expectedResult == twoDimensionalArray.calculateSumAllValues(testArray)){
            System.out.println("Test should count sum is OK");
        } else {
            System.out.println("Test should count sumis FAIL");
        }
    }

    public void sumArrayNegativeTest(){
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] testArray =  {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
        int expectedResult = 13;
        if(expectedResult != twoDimensionalArray.calculateSumAllValues(testArray)){
            System.out.println("Test should NOT count sum is OK");
        } else {
            System.out.println("Test should NOT count sum FAIL");
        }
        }

        public void shouldCreateAnArray(){
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
         //   int[][] testArray = new int[3][3];
            int [][] array = twoDimensionalArray.createArray(3,3);
        if (array == new int [3][3]){
            System.out.println("Test create an array is OK");
        } else {
             System.out.println("Test create an array is FAIL");}
}
}






