package student_deniss_dubko.deniss_dubko_lesson_7_homework.level_1_intern_level_3_junior;

import java.util.Scanner;

class WordService {

    public String writeSomeText() {
        System.out.println("Write some text: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        return text;
    }

    public String[] splitTextToArrayOfWords(String wordsInText) {
        return wordsInText.split(" ");
    }

    public int countWordFrequency(String[] words, String wordToFind) {
        int count = 0;
        for (String word : words) {
            if (word.equals(wordToFind)) {
                count++;
            }
        }
        return count;
    }

    public String findMostFrequentWord(String text) {
        String[] wordsInText = splitTextToArrayOfWords(text);
        int wordMaxFrequencyCount = 0;
        String mostFrequentWord = wordsInText[0];
        for (String word : wordsInText) {
            int wordFrequencyCount = countWordFrequency(wordsInText, word);
            if (wordFrequencyCount > wordMaxFrequencyCount) {
                wordMaxFrequencyCount = wordFrequencyCount;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }

}