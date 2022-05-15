package student_sergei_klunkov.lessson_12.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class UtilListExample {

    List<Integer> numbers = new ArrayList<>();
    List<String> words = new LinkedList<>();
    List<Double> doubles = new Vector<>();

    public void addNumbersInArrayList(int number) {
        for(Integer addNumber : numbers) {
            numbers.add(number);
            System.out.println(addNumber);
        }
    }

    public void addWordsInLinkedList(String word) {
        for(String addWord : words){
            words.add(word);
            System.out.println(addWord);
        }
    }

    public void addDoublesInVector(double number) {
        for(Double addNumber : doubles)
            doubles.add(number);

    }
}

// В стандартной библиотеке Java есть два класса, реализующие интерфейс List.
// Это классы ArrayList и LinkedList.
// Разница между ними в том, что в первом классе реализация списка основана на массиве, а во втором на двунаправленном списке.
