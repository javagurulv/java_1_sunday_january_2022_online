package student_elina_kucenko.lesson7.level1;

class WordService {

    public String findMostFrequentWord(String text) {
        String topWord = null;
        int maxRepeat = 0;
        String[] words = text.split(" ");
        topWord = getTopWord(topWord, maxRepeat, words);
        return topWord;
    }

    private String getTopWord(String topWord, int maxRepeat, String[] words) {
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

//Написать метод, который находит слово
//в тексте встречающееся больше всего раз.

//Если несколько слов в тексте встречаются одинаково
//максимальное число раз, то возвращаем, то слово,
//которое встречается в тексте первым.

//как она будет называться и что будет делать;
//- что ей надо передать на вход (какие параметры);
//- что будет возвращать в качестве результата.

