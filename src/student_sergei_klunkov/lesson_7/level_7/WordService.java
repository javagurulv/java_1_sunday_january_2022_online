package student_sergei_klunkov.lesson_7.level_7;

class WordService {

    public String[] splitTextToArray(String text) {
        return text.split(" ");
    }

    public int[] createArrayFromTextOfWordCountArray(String text) {
        return new int[splitTextToArray(text).length];
    }


    public int[] MostFrequentWordInArray(String text) {
        String[] textArray = splitTextToArray(text);
        int[] countFrequentsWordsInTextArray = createArrayFromTextOfWordCountArray(text);

        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            int wordCounter = 0;
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            countFrequentsWordsInTextArray[wordCount] = wordCounter;
        }
        return countFrequentsWordsInTextArray;
    }

    public String mostFrequentWordInArray(String text) {
        int[] wordCountArray = MostFrequentWordInArray(text);
        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++){
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return splitTextToArray(text)[max];
    }

    public String findMostFrequentWordInArray(String text) {
        return mostFrequentWordInArray(text);
    }

    public void printMostFrequentWordInArrayToConsole(String text) {
        System.out.println(mostFrequentWordInArray(text));
    }






}
