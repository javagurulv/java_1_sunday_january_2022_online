package student_sergei_klunkov.lesson_7.level_1;



class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.firstTest();
        test.secondTest();
        test.thirdTest();

    }



    private void firstTest(){
        WordService service = new WordService();
        String expected = "dog";
        String result = service.findMostFrequentWord("dog dog cat snake");
        if(expected.equals(result)){
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }


    }

    private void secondTest(){
        WordService service = new WordService();
        String expected = "dog";
        String result = service.findMostFrequentWord("dog dog cat cat snake");
        if(expected.equals(result)){
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    private void thirdTest(){
        WordService service = new WordService();
        String expected = "dog";
        String result = service.findMostFrequentWord("dog cat dog dog snake cat");
        if(expected.equals(result)){
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }
}
