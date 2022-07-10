package student_stanislav_astafjev.lesson_7.task_1;


class WordService {
    public static void main(String[] args) {
        String s = "car buss drive car with buss after car";
        String word = findMostFrequentWord(s);
        System.out.println(word);
    }

    static String findMostFrequentWord(String s) {
        String[] str = s.split("\\W+");
        int[] howMuch = new int[str.length];
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < str.length; i++)
            for(int j = 0; j < str.length; j ++)
                if(str[i].equals(str[j])) howMuch[i]++;
        for(int i = 0; i < howMuch.length; i++)
            if(howMuch[i] > maxCount) {
                maxCount = howMuch[i];
                index = i;
            }
        return str[index];
    }


}
class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.firstTest();

    }

    private void firstTest() {
        WordService service = new WordService();
        String expected = "car";
        String result = service.findMostFrequentWord("car car drive buss");
        if(expected.equals(result)) {
            System.out.println("TEST = OK!");
        } else {
            System.out.println("TEST = FAIL");
        }

    }
}