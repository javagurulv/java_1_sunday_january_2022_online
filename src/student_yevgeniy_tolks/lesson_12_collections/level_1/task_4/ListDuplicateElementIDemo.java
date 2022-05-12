package student_yevgeniy_tolks.lesson_12_collections.level_1.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListDuplicateElementIDemo {
    public static void main(String[] args) {
//Lists can store duplicate elements
        List<Integer> integerList = new ArrayList<>();
        integerList.add(122);
        integerList.add(122);
        integerList.add(122);
        for (Integer num : integerList) {
            System.out.println(num);
        }

        List<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(123);
        integerLinkedList.add(123);
        integerLinkedList.add(123);
        for (Integer num : integerLinkedList) {
            System.out.println(num);
        }
    }
}
