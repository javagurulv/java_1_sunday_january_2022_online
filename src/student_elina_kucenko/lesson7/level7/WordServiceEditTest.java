package student_elina_kucenko.lesson7.level7;


public class WordServiceEditTest {
    public static void main(String[] args) {
        WordServiceEditTest test = new WordServiceEditTest();

        test.testOne();
        test.testTwo();
        test.testThree();
    }

    private void testOne() {
        WordServiceEdit service = new WordServiceEdit();
        String expected = "one";
        String result = service.findMostFrequentWord("one one two three");
        if (expected.equals(result)) {
            System.out.println("Test one - OK");
        } else {
            System.out.println("Test one - FAILED");
        }
    }

    private void testTwo() {
        WordServiceEdit service = new WordServiceEdit();
        String expected = "one";
        String result = service.findMostFrequentWord("one one two two three");
        if (expected.equals(result)) {
            System.out.println("Test two - OK");
        } else {
            System.out.println("Test two - FAILED");
        }
    }

    private void testThree() {
        WordServiceEdit service = new WordServiceEdit();
        String expected = "two";
        String result = service.findMostFrequentWord("one two two three one two");
        if (expected.equals(result)) {
            System.out.println("Test three - OK");
        } else {
            System.out.println("Test three - FAILED");
        }
    }


}
