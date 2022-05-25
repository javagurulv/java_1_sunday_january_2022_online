package student_devids_kropacovs.lesson6.level4.task21;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int [][] array = twoDimensionalArray.createTwoDimensionalArray(3,3);
        //int [][] array = new int[10][20];
        twoDimensionalArray.fillTwoDimensionalArrayWithRandomNumbers(array);
        int sum = twoDimensionalArray.sumOfTwoDimensionalArray(array);
        System.out.println(sum);
    }
}
