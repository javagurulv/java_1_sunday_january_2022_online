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

	private int calculateWordApparenceCount(String wordToSearch,
											String[] words) {
		int apparanceCount = 0;
		for (String word : words) {
			if (word.equals(wordToSearch)) {
				apparanceCount++;
			}
		}
		return apparanceCount;
	}

    public String findMostFrequentWord(String text) {
        String[] wordsArray = text.split(" ");

		String maxApperanceWord = wordsArray[0];
		int maxApparenceCount = calculateWordApparenceCount(maxApperanceWord, wordsArray);

		for (String word : wordsArray) {
			int apparenceCount = calculateWordApparenceCount(word, wordsArray);
			if (apparenceCount > maxApparenceCount) {
				maxApperanceWord = word;
				maxApparenceCount = apparenceCount;
			}
		}

        return maxApperanceWord;
    }
}
