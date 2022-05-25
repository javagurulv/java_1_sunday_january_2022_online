package student_sergei_klunkov.lessson_12.level_1.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class SameElementsInArray {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(1);
        numbers.add(1);

        System.out.println(numbers);

        List<String> words = new LinkedList<>();
        words.add("cat");
        words.add("cat");
        words.add("dog");
        words.add("dog");

        System.out.println(words);

    }
}
// Могут ли реализации интерфейса java.util.List хранить одинаковые
// элементы (дубликаты)?
// Да, как мы видим, могут.
