package student_alina_strumpe._lesson_5_arrays_for_loop._lesson_5_Task_37_38;

 class ArrayUtilScannerMinMaxTest {

    public static void main(String[] args){
         ArrayUtilScannerMinMaxTest arrayUtilScannerMinMaxTest = new ArrayUtilScannerMinMaxTest();
          arrayUtilScannerMinMaxTest.shouldCreateArrayTest1();
          arrayUtilScannerMinMaxTest.shouldFindMaxNumberTestMax1();
          arrayUtilScannerMinMaxTest.shouldFindMinNumberTest1();
    }

    public void shouldCreateArrayTest1(){
        ArrayUtilScannerMinMax arrayUtilScannerMinMax = new ArrayUtilScannerMinMax();
        int[] array = arrayUtilScannerMinMax.createArray(3);
        if(array.length > 0 ){
            System.out.println("Test should create an array is OK");
        } else {
            System.out.println("Test should create an array is FAIL");
        }
    }

    public void shouldFindMaxNumberTestMax1(){
        ArrayUtilScannerMinMax arrayUtilScannerMinMax = new ArrayUtilScannerMinMax();
        int[] array = new int[4];
        array[0] = 1;
        array[1] =51;
        array[2] = 100;
        array[3] = 99;

        int maxNumber = arrayUtilScannerMinMax.findMaxInArray(array);
        if(maxNumber == 100){
            System.out.println("Test Find MAX value is OK");
        } else {
            System.out.println("Test Find MAX value is FAIL");
        }
    }

    public void shouldFindMinNumberTest1(){
        ArrayUtilScannerMinMax arrayUtilScannerMinMax = new ArrayUtilScannerMinMax();
        int[] array = {2,20,88,100};
        int minNumber = arrayUtilScannerMinMax.findMinInArray(array);
        if(minNumber == 2){
            System.out.println("Test Find MIN value is OK");
        } else {
            System.out.println("Test Find MAX value is FAIL");
        }
    }
}
