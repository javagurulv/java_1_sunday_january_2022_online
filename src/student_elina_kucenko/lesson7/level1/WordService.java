package student_elina_kucenko.lesson7.level1;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = text.split(" ");
        return getTopWord(words);
    }

    private String getTopWord(String[] words) {
        String topWord = null;
        int maxRepeat = 0;
        for (String currentWord : words) {
            int counter = getTimesRepeated(words, currentWord);
            if (counter > maxRepeat) {
                maxRepeat = counter;
                topWord = currentWord;
            }
        }
        return topWord;
    }

    private int getTimesRepeated(String[] words, String wordToSearch) {
        int counter = 0;
        for (int j = 0; j < words.length; j++) {
            if (words[j].equals(wordToSearch)) {
                counter++;
            }
        }
        return counter;
    }
}
