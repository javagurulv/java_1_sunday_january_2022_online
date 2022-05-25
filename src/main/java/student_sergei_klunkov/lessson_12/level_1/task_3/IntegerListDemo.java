package student_sergei_klunkov.lessson_12.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        // добавить в список элемент (в начало и в конец)

        List<Integer> numbers = new ArrayList<>();

        numbers.add(Integer.parseInt("0"));
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(Integer.parseInt("4"));
        System.out.println(numbers);

        // узнать длину списка

        System.out.println("List length: " + numbers.size());

        // удалить элемент из списка (по индексу и без)

        for(Integer number : numbers){
            System.out.println(number);
        }

        List<Integer> numbersToRemove = new ArrayList<>();
        numbers.remove(1);
        numbersToRemove.add(Integer.parseInt("3"));
        numbers.removeAll(numbersToRemove);
        System.out.println("After remove:");
        numbers.forEach(System.out::println);

        // узнать пустой список или нет

        System.out.println("List isEmpty = " + numbers.isEmpty());

    }
}
