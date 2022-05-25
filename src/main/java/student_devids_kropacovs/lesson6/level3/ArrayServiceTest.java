package student_devids_kropacovs.lesson6.level3;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsNumberTest();
        arrayServiceTest.notContainsNumberTest();
        arrayServiceTest.noOccurrencesInArray();
        arrayServiceTest.oneOccurrenceInArray();
        arrayServiceTest.moreThanOneOccurrenceInArray();

        int[] arr= {6, 4, 8, 1, 9, 21, 3};
        ArrayService arrayService = new ArrayService();
        arrayService.sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void containsNumberTest (){
        ArrayService arrayService = new ArrayService();
        int[] arr= {3, 4, 5, 6, 7};
        boolean expectedResult = true;
        boolean realResult = arrayService.contains(arr, 3);
        if(realResult == expectedResult){
            System.out.println("Contain number in Array test PASS");
        }else{
            System.out.println("Contain number in Array test FAIL");
        }
    }

    public void notContainsNumberTest (){
        ArrayService arrayService = new ArrayService();
        int[] arr= {3, 4, 5, 6, 7};
        boolean expectedResult = false;
        boolean realResult = arrayService.contains(arr, 1);
        if(realResult == expectedResult){
            System.out.println("Do not contain number in Array test PASS");
        }else{
            System.out.println("Do not contain number in Array test FAIL");
        }
    }

    public void noOccurrencesInArray(){
        ArrayService arrayService = new ArrayService();
        int[] arr= {3, 3, 5, 6, 3};
        int expectedResult = 0;
        int realResult = arrayService.countOccurrences(arr,7);
        if(realResult == expectedResult){
            System.out.println("No occurrences in Array test PASS");
        }else{
            System.out.println("No occurrences in Array test FAIL");
        }

    }

    public void oneOccurrenceInArray(){
        ArrayService arrayService = new ArrayService();
        int[] arr= {3, 3, 5, 6, 3};
        int expectedResult = 1;
        int realResult = arrayService.countOccurrences(arr,5);
        if(realResult == expectedResult){
            System.out.println("One occurrence in Array test PASS");
        }else{
            System.out.println("One occurrence in Array test FAIL");
        }
    }

    public void moreThanOneOccurrenceInArray(){
        ArrayService arrayService = new ArrayService();
        int[] arr= {3, 3, 5, 6, 3};
        int expectedResult = 3;
        int realResult = arrayService.countOccurrences(arr,3);
        if(realResult == expectedResult){
            System.out.println("More than one occurrence in Array test PASS");
        }else{
            System.out.println("More than one occurrence in Array test FAIL");
        }
    }


}
