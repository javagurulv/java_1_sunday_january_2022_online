package student_devids_kropacovs.lesson16.level1;

class WordsService {

    public int countRepetitions(String[] words, String specificWordThatNeedsToBeCounted) {
        int countSpecificWordFindings = 0;
        for (String word : words) {
            if (word.equals(specificWordThatNeedsToBeCounted)) {
                countSpecificWordFindings++;
            }
        }
        return countSpecificWordFindings;
    }

}

