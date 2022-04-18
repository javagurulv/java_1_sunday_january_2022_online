package student_yevgeniy_tolks.lesson_7.level_7.task13;

import java.util.Arrays;

class WorldService {

    public String[] splitTextToArray(String text) {
        return text.split(" ");
    }

    public int[] createTextArrayWordCountArray(String text) {
        return new int[splitTextToArray(text).length];
    }

    public int[] equalWordCounterMostMetInTextArray(String text) {
        String[] textArray = splitTextToArray(text);
        int[] countSameWordsInTextArray = createTextArrayWordCountArray(text);

        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            int wordCounter = 0;
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            countSameWordsInTextArray[wordCount] = wordCounter;
        }
        return countSameWordsInTextArray;
    }

    public String wordWithMaxOccurenceInArray(String text) {
        int[] wordCountArray = equalWordCounterMostMetInTextArray(text);
        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return splitTextToArray(text)[max];
    }

    public String findMostFrequentWord(String text) {
        return wordWithMaxOccurenceInArray(text);
    }

    public void printFoundMostFrequentWordFromTextToConsole(String text) {
        System.out.println(wordWithMaxOccurenceInArray(text));
    }
}