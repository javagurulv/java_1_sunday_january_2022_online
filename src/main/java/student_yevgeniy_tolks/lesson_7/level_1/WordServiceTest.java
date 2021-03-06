package student_yevgeniy_tolks.lesson_7.level_1;


public class WordServiceTest {
    public static void main(String[] args) {

        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.firstMostFrequentWordTest();
    }

    public void firstMostFrequentWordTest() {
        String expectedWord = "big";

        WordService wordService = new WordService();
        String resultWord = wordService.findMostFrequentWords("");
        if (expectedWord.equals(resultWord)) {
            System.out.println("First more frequent word found - Test Ok");
        } else {
            System.out.println("Test FAILED");
        }
    }
}
