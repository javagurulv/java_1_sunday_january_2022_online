package student_yevgeniy_tolks.lesson_7.level_1;

class WordService {

    public String createString() {
        String someText = "Big black bug sitting on the big black dog's nose";
        return someText.toLowerCase();
    }

    public String[] stringSplitInArray(String textSplitInWords) {
        return textSplitInWords.split(" ");
    }

    public String findMostFrequentWords(String text) {
        String[] textWords = stringSplitInArray(createString());
        int maxCount=0;
        for (String word : textWords) {
            int count = 1;
            for (String nextWord : textWords) {
                if (word.equals(nextWord)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                text = word;
            }
        }
        return text;
    }
}




