package student_devids_kropacovs.lesson7.task_1;

/*
Дана строка с текстом.
Написать метод, который находит слово
в тексте встречающееся больше всего раз.

Если несколько слов в тексте встречаются одинаково
максимальное число раз, то возвращаем, то слово,
которое встречается в тексте первым.

-
-
-
 */

class WordService {

    public String findMostFrequentWord(String text) {
        String[] textArray;
        int[] wordCountArray;
        textArray = text.split(" ");
        wordCountArray = new int[textArray.length];

        int wordCounter = 0;
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }

        int max = 0;
        for (int count =0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return textArray[max];
    }
}
