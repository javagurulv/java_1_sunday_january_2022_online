package student_elina_kucenko.lesson7.level1;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.testOne();
        test.testTwo();
        test.testThree();
    }

    private void testOne() {
        WordService service = new WordService();
        String expected = "one";
        String result = service.findMostFrequentWord("one one two three");
        if (expected.equals(result)) {
            System.out.println("Test one - OK");
        } else {
            System.out.println("Test one - FAILED");
        }
    }

    private void testTwo() {
        WordService service = new WordService();
        String expected = "one";
        String result = service.findMostFrequentWord("one one two two three");
        if (expected.equals(result)) {
            System.out.println("Test two - OK");
        } else {
            System.out.println("Test two - FAILED");
        }
    }

    private void testThree() {
        WordService service = new WordService();
        String expected = "two";
        String result = service.findMostFrequentWord("one two two three one two");
        if (expected.equals(result)) {
            System.out.println("Test three - OK");
        } else {
            System.out.println("Test three - FAILED");
        }
    }


}
