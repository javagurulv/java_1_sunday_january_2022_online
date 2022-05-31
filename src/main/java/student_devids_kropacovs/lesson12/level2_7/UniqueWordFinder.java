package student_devids_kropacovs.lesson12.level2_7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class UniqueWordFinder {


    Set<String> find(String text){
            Set<String> uniqueWords = new HashSet<>();
            String[] arrayOfWords = text.split(" ");
            uniqueWords.addAll(List.of(arrayOfWords));
        return uniqueWords;
    }
}
