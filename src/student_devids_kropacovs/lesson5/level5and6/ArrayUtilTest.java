package student_devids_kropacovs.lesson5.level5and6;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray(){
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.createArray(5);
        if(arrayUtil.numbers.length == 5){
            System.out.println("Array size is correct");
        }else{
            System.out.println("Array test failed");
        }
    }
}
