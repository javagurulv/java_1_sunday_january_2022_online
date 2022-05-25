package student_sergei_klunkov.lesson_7.level_7;

public class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.firstTest();

    }


    public void firstTest() {
        String text = "cat cat dog dog cat cat cat";
        String expectedFrequentWord = "cat";

        WordService service = new WordService();
        String resultMostFrequentWordInArray = service.findMostFrequentWordInArray(text);
        service.printMostFrequentWordInArrayToConsole(text);

        if(resultMostFrequentWordInArray.equals(expectedFrequentWord)){
            System.out.println(" Test passed! ");
        } else {
            System.out.println(" Test failed! ");
        }

    }






}
