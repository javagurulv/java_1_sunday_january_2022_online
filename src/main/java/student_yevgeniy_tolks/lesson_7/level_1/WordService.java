package student_yevgeniy_tolks.lesson_7.level_1;

class WordService {

    public String createString() {
        String someText = "Big black bug sitting on the big black dog's nose";
        return someText.toLowerCase();
    }

    public String[] splitStringToArrayOfWords(String textSplitInWords) {
        return textSplitInWords.split(" ");
    }

	private int countWordAppearances(String[] words, String wordToFind) {
		int count = 0;
		for (String word : words) {
			if (word.equals(wordToFind)) {
				count++;
			}
		}
		return count;
	}

    public String findMostFrequentWords(String text) {
        String[] textWords = splitStringToArrayOfWords(text);
        int wordMaxAppearanceCount = 0;
		String mostFrequentWord = textWords[0];
        for (String word : textWords) {
            int wordAppearanceCount = countWordAppearances(textWords, word);
            if (wordAppearanceCount > wordMaxAppearanceCount) {
				wordMaxAppearanceCount = wordAppearanceCount;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }
}




