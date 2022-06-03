package student_sergei_klunkov.lesson_12.level_2_to_level_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    public Set<String> find(String text) {
        String[] splitText = text.split(" ");
        return new HashSet<>(Arrays.asList(splitText));
    }
}
