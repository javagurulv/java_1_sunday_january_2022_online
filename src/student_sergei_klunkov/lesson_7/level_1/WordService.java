package student_sergei_klunkov.lesson_7.level_1;



class WordService {

    public String findMostFrequentWord(String text){
        String maxWord = null;
        int maxRepeat = 0;
        String[] words = text.split(" ");
        maxWord = getMaxWord(maxWord, maxRepeat, words);
        return maxWord;


    }

    private String getMaxWord(String maxWord, int maxRepeat, String[] words) {
        for (String currentWord : words) {
            int counter = getHowManyWordsRepeat(words, currentWord);
            if(counter > maxRepeat) {
                maxRepeat = counter;
                maxWord = currentWord;
            }
        }
        return maxWord;
    }

    private int getHowManyWordsRepeat(String[] words, String wordToSearch) {
        int counter = 0;
        for (int i = 0; i < words.length; i ++){
            if (words[i].equals(wordToSearch)){
                counter++;
            }
        }
        return counter;
    }


}


