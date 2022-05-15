package student_yevgeniy_tolks.lesson_12_collections.level_2_3_4.task6_26.task27;

import java.util.*;

class UniqueWordFinder {

    public Set<String> find(String text) {
        String[] splitText = text.split(" ");
        return new HashSet<>(Arrays.asList(splitText));
    }
}
