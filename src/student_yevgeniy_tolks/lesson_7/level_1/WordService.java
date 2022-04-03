package student_yevgeniy_tolks.lesson_7.level_1;

import java.util.Arrays;

class WordService {

    public String findMostFrequentWords(String text) {
        String[] words = stringSplitInArray(createString());
        System.out.println(Arrays.toString(words));
        int maxCount = 0;
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                text = words[i];
            }
        }

        return text;
    }

    public String createString() {
        String someText ="Big black bug sitting on the big black dog nose";
        return someText.toLowerCase();
    }

    public String[] stringSplitInArray(String textSplitInWords) {
        return textSplitInWords.split(" ");
    }
}



